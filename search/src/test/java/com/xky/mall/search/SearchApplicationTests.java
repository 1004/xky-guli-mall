package com.xky.mall.search;

import com.xky.mall.search.config.MallElasticSearchConfig;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class SearchApplicationTests {

    @Autowired
    RestHighLevelClient client;

    @Test
    void contextLoads() {
        System.out.println(client);
    }

    @Test
    void indexData() throws IOException {
        IndexRequest indexRequest = new IndexRequest("users");
        indexRequest.id("1");
        indexRequest.source("{" +
                "\"user\":\"kimchy\"," +
                "\"postDate\":\"2013-01-30\"," +
                "\"message\":\"trying out Elasticsearch\"" +
                "}", XContentType.JSON);
        client.index(indexRequest, MallElasticSearchConfig.COMMON_OPTIONS);
    }

}
