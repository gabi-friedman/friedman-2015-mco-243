package friedman.generateMD5;

import org.apache.commons.codec.digest.DigestUtils;

public class GenerateMD5 {
	public static void main(String[] args){
		System.out.println(DigestUtils.md5Hex("I will graduate soon"));
	}
}
