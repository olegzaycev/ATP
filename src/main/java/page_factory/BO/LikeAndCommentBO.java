package page_factory.BO;

import io.qameta.allure.Step;
import page_factory.PO.UserProfilePO;

public class LikeAndCommentBO {

    @Step("ChoosePhotoAndLike")
    public UserProfilePO ChoosePhotoAndLike(){
        UserProfilePO userProfilePO = new UserProfilePO();
        return userProfilePO.Timer(8000).ClickPost().Timer(8000).ClickLike();
    }


}
