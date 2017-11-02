import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;

public class AmazonTest {
    public static void main(String[] args){
        System.out.println("hello world");

        AmazonS3Client a=new AmazonS3Client();
        Bucket alexa=a.createBucket("alexa");

        System.out.println(alexa.getName());
    }

    public static String getStr(){
        return "hi";
    }
}
