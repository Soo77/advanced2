package hello.advanced2.trace.hellotrace;

import hello.advanced2.trace.TraceStatus;
import org.junit.jupiter.api.Test;

class HelloTraceV1Test {

    @Test
    void begin_end() {
        HelloTraceV2 trace = new HelloTraceV2();
        TraceStatus status = trace.begin("안뇽안뇽");
        trace.end(status);
    }

    @Test
    void begin_exception() {
        HelloTraceV2 trace = new HelloTraceV2();
        TraceStatus status = trace.begin("나는에러낼거야");
        trace.exception(status, new IllegalStateException());
    }

}