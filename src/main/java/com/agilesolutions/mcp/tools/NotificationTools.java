package com.agilesolutions.mcp.tools;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationTools {

    @Tool(description = "Send notification message")
    public String notify(@ToolParam(description = "Notification Message") String message) {

        log.info("Notification message sent =>> {}",message);

        return message;

    }

}
