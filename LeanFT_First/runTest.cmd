
SET JDK_HOME=C:\Program Files (x86)\Java\jdk1.8.0_131
SET LEANFT_SDK_HOME=C:\leanftjars\lib

SET JUNIT_JAR="%LEANFT_SDK_HOME%\junit.jar;%LEANFT_SDK_HOME%\org.hamcrest.core_1.3.0.v201303031735.jar"
SET LEANFT_JAR="%LEANFT_SDK_HOME%\com.hp.lft.sdk-standalone.jar;%LEANFT_SDK_HOME%\com.hp.lft.common.jar;%LEANFT_SDK_HOME%\com.hp.lft.report.jar;%LEANFT_SDK_HOME%\com.hp.lft.reportbuilder-standalone.jar;%LEANFT_SDK_HOME%\com.hp.lft.unittesting.jar;%LEANFT_SDK_HOME%\com.hp.lft.verifications.jar"


java -cp %JUNIT_JAR%;%LEANFT_JAR%;.\bin org.junit.runner.JUnitCore LeanFtTest

