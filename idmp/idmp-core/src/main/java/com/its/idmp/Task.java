package com.its.idmp;

import org.eclipse.jdt.annotation.Nullable;

public class Task
{
	private final @Nullable String jobId;

	public Task(@Nullable String jobId)
	{
		this.jobId = jobId;
	}

	public @Nullable String jobId()
	{
		return this.jobId;
	}
}
