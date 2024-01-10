package org.springframework.ai.vectorstore;

import java.util.Optional;

public class QueryOptions {

    /**
     * Maximum number of nearest neighbours to be retrieved from the vector store.
     */
    private int k;

    /**
     * Lower bound of the similarity score, used to filter results.
     */
    private Optional<Double> threshold = Optional.empty();

    public QueryOptions withK(int k) {
        this.k = k;
        return this;
    }

    public QueryOptions withSimilarityThreshold(double threshold) {
        this.threshold = Optional.of(threshold);
        return this;
    }

    public static QueryOptions create() {
        return new QueryOptions();
    }
}
