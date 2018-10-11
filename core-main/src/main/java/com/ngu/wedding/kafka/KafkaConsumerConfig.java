package com.ngu.wedding.kafka;

/**
 * Init the Consumer Config for Kafka.  GroupID could be overarching Domain, maybe break out more configs?
 */
//@EnableKafka
//@Configuration
public class KafkaConsumerConfig
{

	/*private ApplicationProperties applicationProperties;

	public KafkaConsumerConfig(ApplicationProperties applicationProperties)
	{
		this.applicationProperties = applicationProperties;
	}

//	@Bean
	public ConsumerFactory<String, String> consumerFactory()
	{
		Map<String, Object> props = new HashMap<>();
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, applicationProperties.getKafkaUri());
		props.put(ConsumerConfig.GROUP_ID_CONFIG, applicationProperties.getKafkaGroupId());
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		
		return new DefaultKafkaConsumerFactory<>(props);
	}

//	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, String>
	kafkaListenerContainerFactory(ConsumerFactory<String, String> consumerFactory)
	{
		ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		return factory;
	}

	*/

}
