package util;

public class MenuUtil {

    public static int showMenu(){
        System.out.println(
                "========== Type Speed Game ==========\n" +
                        "[1]. PLAY \n" +
                        "[2]. SCORE \n" +
                        "[3]. EXIT"
        );
        return InputUtil.requiredInputInt("Select the option: ");
    }
}
