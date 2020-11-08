package Builder;

/**
 * @Author: HouX
 * @Date: 2020/11/8
 * @Description:
 */
public class TicketHelper {
    public void buildAdult(String info){
        System.out.println("构建成年人票逻辑: " + info);
    }
    public void buildChildrenForSeat(String info){
        System.out.println("构建有座儿童票逻辑: " + info);
    }
    public void buildChildrenNoSeat(String info){
        System.out.println("构建无座儿童票逻辑: " + info);
    }
    public void buildElderly(String info){
        System.out.println("构建有老年人票票逻辑: " + info);
    }
    public void buildSoldier(String info){
        System.out.println("构建军人机器家属票逻辑: " + info);
    }

}
