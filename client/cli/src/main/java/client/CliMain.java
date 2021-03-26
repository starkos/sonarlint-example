package client;

import com.its.idmp.PlatformType;

/**
 * The CLI provides a simple way for developers and system administrators to
 * initiate and monitor jobs.
 */
public class CliMain
{
	public static void main(String[] args)
	{
		System.out.println("[CLI] Initiating a work request");
		System.out.println("[CLI] Platform class is " + PlatformType.LOCAL.getImplementationClassName());
	}
}
