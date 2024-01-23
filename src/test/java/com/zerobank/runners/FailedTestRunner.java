package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/zerobank/step_defs",
        plugin = {"html:target/failed-html-reports.html"}
)
public class FailedTestRunner {  // 100 test koşsak 5 i kalsa kalan 5 testi koşturacak olan class budur
}
