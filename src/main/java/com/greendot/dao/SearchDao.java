/*
 *  This file is subject to the terms and conditions defined in file 'LICENSE.md',
 *  which is part of this source code package.
 */

package com.greendot.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * @author matt.d.vickery@greendotsoftware.co.uk
 * @since 10/25/16.
 */
public interface SearchDao<E extends Serializable, I extends Serializable> {
    Optional<E> findById(I id);

    List<E> findAll();
}