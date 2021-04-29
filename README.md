# spring-cloud-work-flow

**Problem Statement:**

Application receives transaction file every day from various clients. These transaction files contain high volume of data for processing. Since the transaction can be relating to settlement or cash transfer, they are time sensitive and needs to be process on certain time window.

**Solution:**

Spring Cloud Data Flow with Kafka-binder is used for the solutioning. 

- A flow that receives an event from an input, perform some action(s) and send the result to an output.
- The inputs are the **Source**, the outputs are the **Sink** and then we have the **Processor** that consumes the data and returns it to the output. 
- For this specific problem, please see the technical design as below

**Producer**
Source of the trades coming to the system for processing

**Processor**
Process and validates the trades and send them to kafka topic. In case of validation fail system still send the trades to Kafka topic.

**SINK/Consumer**
Store the Trade data to respective system and sent to downstreams.


![image](https://user-images.githubusercontent.com/36263824/116428102-3be42180-a862-11eb-9e56-869073ca705e.png)



**TradeParallelProcessorImpl** output the following - 

- Average time to process each file = 223 milliseconds
- No of trades processed per milliseconds = 17741
- Total No Of Trades Processed count = 39600000
- Faulty Trade count = 13200000


