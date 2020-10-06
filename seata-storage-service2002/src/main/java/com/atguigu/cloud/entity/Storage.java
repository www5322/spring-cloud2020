/**
 * Storage.java 2020年10月5日
 */
package com.atguigu.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * <b>Storage</b> is
 * </p>
 *
 * @since 2020年10月5日
 * @author zengwk
 * @version $Id$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {

	private Long id;
	private Long productId;
	private Integer total;
	private Integer used;
	private Integer residue;

}
