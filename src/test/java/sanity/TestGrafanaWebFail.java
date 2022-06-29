package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TestGrafanaWebFail {


    @Test ( enabled = false ,description = "Test 06-1 - Verify Avatar Icon FAIL  - should fail ")
    @Description("This Test verifies the Verify Avatar Icon using Visual sikulix-api")
    public void test06_1_verifyAvatarIcon_fail()
    {

        Verifications.visualElement("FakeGrafanaAvatar");  // FAILURE TEST
//        Verifications.visualElement("SimilarGrafanaAvatar");  // SIMILAR IMAGE TEST
//        Verifications.visualElement("EmptyGrafanaAvatar");  // EMPTY TEST
//        Verifications.visualElement("Avatar");  // LARGE TEST
//        Verifications.visualElement("GrafanaAvatar");  // TRUE TEST

    }

    @Test ( enabled = false ,description = "Test 06-2  - Verify Avatar Icon SIMILAR  - should fail ")
    @Description ("This Test verifies the Verify Avatar Icon using Visual sikulix-api")
    public void test06_2_verifyAvatarIcon_similar()
    {
//        Verifications.visualElement("FakeGrafanaAvatar");  // FAILURE TEST
        Verifications.visualElement("SimilarGrafanaAvatar");  // SIMILAR IMAGE TEST
//        Verifications.visualElement("EmptyGrafanaAvatar");  // EMPTY TEST
//        Verifications.visualElement("Avatar");  // LARGE TEST
//        Verifications.visualElement("GrafanaAvatar");  // TRUE TEST

    }

    @Test ( enabled = false ,description= "Test  06-3 - Verify Avatar Icon EMPTY  - should fail ")
    @Description ("This Test verifies the Verify Avatar Icon using Visual sikulix-api")
    public void test06_3_verifyAvatarIcon_empty()
    {
//        Verifications.visualElement("FakeGrafanaAvatar");  // FAILURE TEST
//        Verifications.visualElement("SimilarGrafanaAvatar");  // SIMILAR IMAGE TEST
        Verifications.visualElement("EmptyGrafanaAvatar");  // EMPTY TEST
//        Verifications.visualElement("Avatar");  // LARGE TEST
//        Verifications.visualElement("GrafanaAvatar");  // TRUE TEST

    }

    @Test ( enabled = false , description = "Test 06-4 - Verify Avatar Icon - Verify Avatar Icon LARGE   - should fail")
    @Description ("This Test verifies the Verify Avatar Icon using Visual sikulix-api")
    public void test06_4_verifyAvatarIcon()
    {
//        Verifications.visualElement("FakeGrafanaAvatar");  // FAILURE TEST
//        Verifications.visualElement("SimilarGrafanaAvatar");  // SIMILAR IMAGE TEST
//        Verifications.visualElement("EmptyGrafanaAvatar");  // EMPTY TEST
        Verifications.visualElement("Avatar");  // LARGE TEST
//        Verifications.visualElement("GrafanaAvatar");  // TRUE TEST
    }

    @Test ( enabled = false ,description = "Test 06-5 - Verify Avatar Icon")
    @Description ("This Test verifies the Verify Avatar Icon using Visual sikulix-api")
    public void test06_5_verifyAvatarIcon()
    {
//        Verifications.visualElement("FakeGrafanaAvatar");  // FAILURE TEST
//        Verifications.visualElement("SimilarGrafanaAvatar");  // SIMILAR IMAGE TEST
//        Verifications.visualElement("EmptyGrafanaAvatar");  // EMPTY TEST
//        Verifications.visualElement("Avatar");  // LARGE TEST
        Verifications.visualElement("GrafanaAvatar");  // TRUE TEST
    }
}
