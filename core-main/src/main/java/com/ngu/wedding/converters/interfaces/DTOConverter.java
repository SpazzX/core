package com.ngu.wedding.converters.interfaces;

/**
 * @author bkenn
 * @param <T>
 * @param <F>
 */
public interface DTOConverter<T, F>
{
	/**
	 * Convert to the DTO from DOA domain
	 */
	T convertFromDTO(F from);

	/**
	 * Convert to the DOA domain from DTO
	 */
	F convertToBean(T to);
}
