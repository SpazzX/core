package com.ngu.wedding.kafka;

//@Configuration
public class KafkaProducerConfig
{
	/*private ApplicationProperties applicationProperties;

	public KafkaProducerConfig(ApplicationProperties applicationProperties)
	{
		this.applicationProperties = applicationProperties;
	}

	//@Bean
	public ProducerFactory<String, String> producerFactory()
	{
		Map<String, Object> configProps = new HashMap<>();
		configProps.put(
				ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,
				applicationProperties.getKafkaUri());
		configProps.put(
				ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
				StringSerializer.class);
		configProps.put(
				ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
				StringSerializer.class);

		return new DefaultKafkaProducerFactory<>(configProps);
	}

	//@Bean
	public KafkaTemplate<String, String> kafkaTemplate() {
		return new KafkaTemplate<>(producerFactory());
	}

	*/

}
