const { Builder, Key, By, Capabilities } = require("selenium-webdriver")
const chromecapabilities = Capabilities.chrome();

const assert = require('assert');

async function test() {
    chromecapabilities.set('chromeOptions', { args: ['--headless'] });
    let driver = await new Builder().withCapabilities(chromecapabilities).build();

    await driver.get("https://playground.digitalhouse.com/login");
    //await driver.manage().window().maximize();

    await driver.sleep(5000);

    await driver.findElement(By.id("username")).sendKeys("m33agra@hotmail.com");
    await driver.findElement(By.id("input-password")).sendKeys("m33agra@hotmail.com");
    await driver.findElement(By.xpath("//button[@type='submit']")).click();
        //xpath("//button[type=''submit]")).click();

    await driver.sleep(5000);

    let buttonTextToCompare = await driver.findElement(By.id("SubmitLoginButton")).getAttribute('value');
    assert.strictEqual(buttonTextToCompare, "Ingresar");

    await driver.sleep(5000);

    console.log("Login successfully");

    await driver.sleep(5000);
    await driver.quit();
}

test();
