package ArgumentCaptor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgumentCaptor {

  public static void testArgumentCaptor(){
    ArgumentCaptor<BaseEvent> eventArgumentCaptor = ArgumentCaptor.forClass(BaseEvent.class);
    kycResumeHandler.handleBeginOperation(transactionOperationResolutionRequest, true);
    Mockito.verify(eventIngestionService, times(1))
        .ingestAsyncEvent(eventArgumentCaptor.capture());

    KycResumeActionEvent kycResumeActionEvent = (KycResumeActionEvent) eventArgumentCaptor.getAllValues()
        .get(0);
    assertEquals(EventType.HOMEPAGE_KYC_FAILED_EVENT, kycResumeActionEvent.getEventType());

  }
}
