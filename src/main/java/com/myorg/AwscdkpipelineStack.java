package com.myorg;

import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
// import software.amazon.awscdk.Duration;
// import software.amazon.awscdk.services.sqs.Queue;

public class AwscdkpipelineStack extends Stack {
    public AwscdkpipelineStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public AwscdkpipelineStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        // The code that defines your stack goes here

        // example resource
        // final Queue queue = Queue.Builder.create(this, "AwscdkpipelineQueue")
        //         .visibilityTimeout(Duration.seconds(300))
        //         .build();
    }
}
