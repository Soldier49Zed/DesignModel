package Builder;

/**
 * @Author: HouX
 * @Date: 2020/11/8
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        TicketHelper helper = new TicketHelper();
        helper.buildAdult("成人票");
        helper.buildChildrenForSeat("有座儿童");
        helper.buildChildrenNoSeat("无座儿童");
        helper.buildElderly("老人票");
        helper.buildSoldier("军人票");
        Object ticket = TicketBuilder.builder(helper);
    }
}
