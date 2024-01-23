package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json", //koşulan testlerle alakalı datalar burda
                "html:target/default-html-report.html", // json datasından html rapor oluşturuyor
                "rerun:/target/rerun.txt" // koşulan tesrlerden kalan testler buraya loglanır
        },
        features = "src/test/resources/features",
        glue = "com/zerobank/step_defs",
        dryRun = false,
        tags = ""


)
public class CukesRunner {
}
