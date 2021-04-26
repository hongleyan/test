import org.apache.commons.lang.StringUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class a {
    //    ftp://PEREPORT:Admin123@10.1.111.171/PEReport/Report141/1404412/4200591.pdf
//    ftp://PEREPORT:Admin123@117.160.135.243:8106/PEReport/Report141/1404412/4200591.pdf
//    ftp://PEREPORT:Admin123@117.160.135.243:8106/DHCPEIReport.PDF
    public static void main(String[] args) throws Exception {
        System.out.println("-----------------------应用启动------------------------");
        FTPClient ftpClient = FTPUtil.connectFtpServer("10.1.111.171", 8106, "PEREPORT", "Admin123", "gbk");
        System.out.println("FTP 连接是否成功：" + ftpClient.isConnected());
        System.out.println("FTP 连接是否有效：" + ftpClient.isAvailable());
        FTPUtil.downloadSingleFile(ftpClient, "E:\\u01\\data\\upload\\files\\20210414\\bbb", "PEReport\\Report141\\1404412\\4200591.pdf");
//        downloadSingleFile(ftpClient, "E:/u01/data/upload/files/20210414", "/PEReport/Report141/1404412/4200591.pdf");
        FTPUtil.closeFTPConnect(ftpClient);
        System.out.println("-----------------------应用关闭------------------------");
    }
}



