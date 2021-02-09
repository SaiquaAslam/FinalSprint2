package com.cg.main.service;

import java.util.*;

import com.cg.main.model.GardenDecor;



/**
 * Interface for DecorService Class
 * @author minal koli
 *
 */

public interface IDecorService {

	/**
	 * 
	 * @param productId
	 * @return getGardenDecor
	 */

	GardenDecor getGardenDecor(Integer productId);

	/**
	 * 
	 * @return getAllGardenDecors
	 */

	List<GardenDecor> getAllGardenDecors();

	/**
	 * 
	 * @param gardendecor
	 * @return addGardenDecor
	 */

	GardenDecor addGardenDecor(GardenDecor gardendecor);

	/**
	 * 
	 * @param productname
	 * @return getAllGardenDecorName
	 */

	List<GardenDecor> getAllGardenDecorName(String productName);

	/**
	 * 
	 * @param gardendecor
	 * @return updateGardenDecor
	 */

	GardenDecor updateGardenDecor(GardenDecor gardendecor);

	/**
	 * 
	 * @param productId
	 * @return deleteGardenDecor
	 */

	List<GardenDecor> deleteGardenDecor(Integer productId);
}
