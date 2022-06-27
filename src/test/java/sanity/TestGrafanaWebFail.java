package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class FailedTestGrafanaWeb {


    @Test(description = "Test 06 - Verify Avatar Icon FAIL  - should fail ")
    @Description("This Test verifies the Verify Avatar Icon using Visual sikulix-api")
    public void test06_verifyAvatarIcon_fail()
    {

        Verifications.visualElement("FakeGrafanaAvatar");  // FAILURE TEST
//        Verifications.visualElement("SimilarGrafanaAvatar");  // SIMILAR IMAGE TEST
//        Verifications.visualElement("EmptyGrafanaAvatar");  // EMPTY TEST
//        Verifications.visualElement("Avatar");  // LARGE TEST
//        Verifications.visualElement("GrafanaAvatar");  // TRUE TEST

    }

    @Test (description = "Test 07 - Verify Avatar Icon SIMILAR  - should fail ")
    @Description ("This Test verifies the Verify Avatar Icon using Visual sikulix-api")
    public void test07_verifyAvatarIcon_similar()
    {
//        Verifications.visualElement("FakeGrafanaAvatar");  // FAILURE TEST
        Verifications.visualElement("SimilarGrafanaAvatar");  // SIMILAR IMAGE TEST
//        Verifications.visualElement("EmptyGrafanaAvatar");  // EMPTY TEST
//        Verifications.visualElement("Avatar");  // LARGE TEST
//        Verifications.visualElement("GrafanaAvatar");  // TRUE TEST

    }

    @Test (description= "Test 08 - Verify Avatar Icon EMPTY  - should fail ")
    @Description ("This Test verifies the Verify Avatar Icon using Visual sikulix-api")
    public void test08_verifyAvatarIcon_empty()
    {
//        Verifications.visualElement("FakeGrafanaAvatar");  // FAILURE TEST
//        Verifications.visualElement("SimilarGrafanaAvatar");  // SIMILAR IMAGE TEST
        Verifications.visualElement("EmptyGrafanaAvatar");  // EMPTY TEST
//        Verifications.visualElement("Avatar");  // LARGE TEST
//        Verifications.visualElement("GrafanaAvatar");  // TRUE TEST

    }

    @Test (description = "Test 09 - Verify Avatar Icon - Verify Avatar Icon LARGE   - should fail")
    @Description ("This Test verifies the Verify Avatar Icon using Visual sikulix-api")
    public void test09_verifyAvatarIcon()
    {
//        Verifications.visualElement("FakeGrafanaAvatar");  // FAILURE TEST
//        Verifications.visualElement("SimilarGrafanaAvatar");  // SIMILAR IMAGE TEST
//        Verifications.visualElement("EmptyGrafanaAvatar");  // EMPTY TEST
        Verifications.visualElement("Avatar");  // LARGE TEST
//        Verifications.visualElement("GrafanaAvatar");  // TRUE TEST
    }

    @Test (description = "Test 10 - Verify Avatar Icon")
    @Description ("This Test verifies the Verify Avatar Icon using Visual sikulix-api")
    public void test10_verifyAvatarIcon()
    {
//        Verifications.visualElement("FakeGrafanaAvatar");  // FAILURE TEST
//        Verifications.visualElement("SimilarGrafanaAvatar");  // SIMILAR IMAGE TEST
//        Verifications.visualElement("EmptyGrafanaAvatar");  // EMPTY TEST
//        Verifications.visualElement("Avatar");  // LARGE TEST
        Verifications.visualElement("GrafanaAvatar");  // TRUE TEST
    }
}
