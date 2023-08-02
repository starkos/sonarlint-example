package com.its.idmp;

import org.eclipse.jdt.annotation.NonNull;

public class Request
{
	private final @NonNull String jobId;

	public Request(@NonNull String jobId)
	{
		this.jobId = jobId;
	}

	public @NonNull String jobId()
	{
		return this.jobId;
	}
}
