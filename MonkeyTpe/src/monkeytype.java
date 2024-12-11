import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class monkeytype {

    private static Robot robot;

    public static void main(String[] args) throws InterruptedException {
        try {
            robot = new Robot(); // Initialize the Robot instance
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://monkeytype.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[9]/dialog[2]/div[2]/div[2]/div[2]/button[1]")).click();
        WebElement elementWords = driver.findElement(By.id("words"));
        List<WebElement> words = elementWords.findElements(By.className("word"));
        String textBlock = words.stream().map(WebElement::getText).collect(Collectors.joining(" "));

        boolean keepGoing = true;
        while (keepGoing) {
            try {
                // Move to a specific location and click
//                robot.mouseMove(960, 540);
                robot.mouseMove(683, 384);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                // Write text
                for (char c : textBlock.toCharArray()) {
                    int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
                    if (keyCode != KeyEvent.VK_UNDEFINED) {
                        robot.keyPress(keyCode);
                        robot.keyRelease(keyCode);
                    }
                }

                String oldTextBlock = textBlock;
                String searchString = oldTextBlock.substring(oldTextBlock.length() - 10);

                elementWords = driver.findElement(By.id("words"));
                words = elementWords.findElements(By.className("word"));
                textBlock = words.stream().map(WebElement::getText).collect(Collectors.joining(" "));

                textBlock = textBlock.substring(textBlock.indexOf(searchString)).replace(searchString, " ");
            } catch (Exception e) {
                e.printStackTrace();
                keepGoing = false;
            }
        }
    }
}