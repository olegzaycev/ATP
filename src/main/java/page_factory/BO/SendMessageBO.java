package page_factory.BO;

import io.qameta.allure.Step;
import page_factory.PO.UserProfilePO;

public class SendMessageBO {
    @Step("SendMessage")
    public UserProfilePO SendMessage() {
        UserProfilePO userProfilePO = new UserProfilePO();
        return userProfilePO.Timer(8000).ClickMessage().Timer(8000).InputTextMessage("dsadasdasd").ButtonSendMessage();
    }
}
