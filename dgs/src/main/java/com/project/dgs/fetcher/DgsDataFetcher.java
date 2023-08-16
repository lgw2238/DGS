package com.project.dgs.fetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;

@DgsComponent
public class DgsDataFetcher {
    @DgsData(parentType = "Query", field = "hello")
    public String hello() {
        return "Hello, GraphQL123123!";
    }
}
