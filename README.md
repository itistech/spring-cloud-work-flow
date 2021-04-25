# spring-cloud-work-flow


Spring Cloud Data Flow with Kafka-binder

- A flow that receives an event from an input, perform some action(s) and send the result to an output.
- The inputs are the **Source**, the outputs are the **Sink** and then we have the **Processor** that consumes the data and returns it to the output. 


**TradeParallelProcessorImpl** output the following - 

- Average time to process each file = 223 milliseconds
- No of trades processed per milliseconds = 17741
- Total No Of Trades Processed count = 39600000
- Faulty Trade count = 13200000
