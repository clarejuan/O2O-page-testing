/**
 *
 */
package com.versionone.config;

import Configuration.Environment;

/**
 * @author hannibal
 *
 */
public final class ConfigFiles
{
    /**
     * Selenium Config File Name.
     */
    public static final String SELENIUM_CONFIG = "seleniumConfig.properties";

    /**
     * Local Selenium Config File Name.
     */
    public static final String SELENIUM_LOCAL_CONFIG = "seleniumConfig.local.properties";

    /**
     * Test Case Config Name.
     */
    //public static final String PROFILE_HOST = "https://origin.latest.profile-ui.hkdl.ap-northeast-1.wdpro.disney.com/";
    public static final String PAGE_HOST = "https://10.202.16.217:9002/b2cstorefront/?site=electronics";
    public static final String COPY_DIR = "conf//copies//content.properties";
    public static final String XPATH_DIR = "conf//xpathes//";
    public static final String TESTCASE_CONFIG = "googleXlsTests.properties";
    public static final String TEST_REPORT = "test-output/index.html";
    
    public static final String PAGE_LOGIN = PAGE_HOST;
    /**
     * Hidden constructor.
     */
    private ConfigFiles()
    {

    }
}
