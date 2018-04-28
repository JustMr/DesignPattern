import com.lius.ConcreteCreator.FactoryAdd;
import com.lius.inter.IFactory;
import com.lius.inter.IOperator;

/**
 * 工厂模式
 * 是对简单工厂模式进一步抽象和推广
 * 虽然增加了扩展，但减少了修改，更符合开放-封闭原则
 * 因此降低了客户程序和产品程序之间耦合
 * 本例将简单工厂模式中使用的运算例子修改为工厂模式
 * 个人观点：
 * 抽象工厂模式是对工厂模式的一个“扩充”
 * 让工厂生成接口中加入更多的“产品”，便成为了抽象工程模式
 * 每增加一个产品，IFactory就多增加一个接口方法，再多增加一个IOperator接口，及对应的诸多产品类
 * Created by liushuangbo on 2018/4/26.
 */
public class FactoryMain {
    public static void main(String[] args) {
        IFactory factory = new FactoryAdd();
        IOperator operator = factory.createFactory();

        operator.setNumA(5.00);
        operator.setNumB(6.00);

        try {
            System.out.println(operator.operate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
