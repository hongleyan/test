import java.util.ArrayList;
import java.util.List;

public class webservice {
    public static void main(String[] args) {
//
//        try {
//            String endpoint = "http://localhost:8080/ca3/services/caSynrochnized?wsdl";
//            //直接引用远程的wsdl文件
//            //以下都是套路
//            Service service = new Service();
//            Call call = (Call) service.createCall();
//            call.setTargetEndpointAddress(endpoint);
//            call.setOperationName("addUser");//WSDL里面描述的接口名称
//            call.addParameter("userName", org.apache.axis.encoding.XMLType.XSD_DATE,
//                                       javax.xml.rpc.ParameterMode.IN);//接口的参数
//            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);//设置返回类型
//            String temp = "测试人员";
//            String result = (String) call.invoke(new Object[]{temp});//给方法传递参数，并且调用方法
//            System.out.println("result is " + result);
//        } catch (Exception e) {
//            System.err.println(e.toString());
//        }

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");

        for (String s : list
        ) {
            System.out.println(s);
            break;
        }
    }
}
