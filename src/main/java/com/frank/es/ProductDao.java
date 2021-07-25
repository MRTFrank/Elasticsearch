package com.frank.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: zhaobin
 * @date: 2021/7/25
 */
@Repository
public interface ProductDao extends ElasticsearchRepository<Product,Long> {
}
