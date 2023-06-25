# Web Automation Execrices




## Documentation
ELEMENT:

To optimize the web element's actions, such as typing, clicking etc the creation of interface/abstract class is needed. This is the abstract class src/main/java/base/Element.java

The object, that is going to be enhanced dynamically is the src/main/java/base/WebCoreElement.java. It inherits the Element.

The src/main/java/base/LogElement.java class is used for logging after performing a particular action

DRIVER:
Again a abstract class Driver is created, which holds all needed methods for the driver. Also I changed the "driver.navigate().to()" to "driver.goToUrl() which improves the readability of the program.

The WebCoreDriver class will derive from the abstract Driver class. Instead of calling the findElement method directly, we will first use the WebDriverWait to wait for the elements to exists and then return them using the findElement method.

I'm using the WebDriverManager package for the browser's drivers. The browsers are set up in the WebCoreDriver class, e.g. "WebDriverManager.chromedriver().setup()". The hardcoded path for the drivers is not needed, the WebDriverManager downloads the drivers under the hood.