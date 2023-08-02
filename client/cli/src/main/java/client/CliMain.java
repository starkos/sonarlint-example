package client;

import java.util.Objects;

import com.its.idmp.Request;
import com.its.idmp.Task;

public class CliMain
{
	public Request prepareRequest(Task task)
	{
		var jobId = Objects.requireNonNullElse(task.jobId(), "0");
		return new Request(jobId);
	}

	@SuppressWarnings("java:S106") // console output
	public static void main(String[] args)
	{
		System.out.println("Initiating a work request");
	}
}
