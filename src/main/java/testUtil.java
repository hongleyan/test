import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class testUtil {

    public static void javaToxml(Testpo stu) throws Exception {
    // 获取JAXB的上下文环境，需要传入具体的 Java bean -> 这里使用Student
        JAXBContext context = JAXBContext.newInstance(Testpo.class);
    // 创建 Marshaller 实例
        Marshaller marshaller = context.createMarshaller();
    // 设置转换参数 -> 这里举例是告诉序列化器是否格式化输出
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    // 构建输出环境 -> 这里使用标准输出，输出到控制台Console
        PrintStream out = System.out;
    // 将所需对象序列化 -> 该方法没有返回值
        marshaller.marshal(stu, out);


        aaa(stu);
    }


    private static void aaa(Testpo clazz){
//        Field[] declaredFields = clazz.getDeclaredFields();
    }
}
