package com.its.idmp;

public enum PlatformType
{
	AWS,
	LOCAL;

	/**
	 * Returns the fully qualified class name for the concrete implementation of
	 * this platform type.
	 */
	public String getImplementationClassName()
	{
		return (this == AWS)
			? "com.its.idmp.aws.AwsPlatformClient"
			: "com.its.idmp.local.LocalPlatformClient";
	}
}
