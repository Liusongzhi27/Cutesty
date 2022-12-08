package Parameters;

public class LoginScene {
    private static  String USERNAME = "//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[1]/label/input";

    private static  String PASSWORD = "//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[2]/label/input";

    private static  String REMBER_CONTENT = "//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[3]/div/label/div/ins";
    private static  String LOGIN = "//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[4]/button";

    public LoginScene() {
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static void setUSERNAME(String USERNAME) {
        LoginScene.USERNAME = USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static void setPASSWORD(String PASSWORD) {
        LoginScene.PASSWORD = PASSWORD;
    }

    public static String getRemberContent() {
        return REMBER_CONTENT;
    }

    public static void setRemberContent(String remberContent) {
        REMBER_CONTENT = remberContent;
    }

    public static String getLOGIN() {
        return LOGIN;
    }

    public static void setLOGIN(String LOGIN) {
        LoginScene.LOGIN = LOGIN;
    }
}
