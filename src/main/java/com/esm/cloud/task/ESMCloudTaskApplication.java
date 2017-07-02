package com.esm.cloud.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class ESMCloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(ESMCloudTaskApplication.class, args);
	}

	@Bean
	public EsmProcessingTask esmProcessingTask() {
		return new EsmProcessingTask();
	}

	public class EsmProcessingTask implements CommandLineRunner {

		@Override
		public void run(String... args) throws Exception {
			if (null != args) {
				System.out.println("Parameter length is = " + args.length);

				String stationId = args[1];
				String licensePlate = args[2];
				String timestamp = args[3];

				System.out.println("Station ID = " + stationId + ", Plate is = " + licensePlate + ", time = " + timestamp);

			}

		}

	}
}
