/**
 * Copyright ©  青岛学海教育. All rights reserved.
 * TODO:这里添加file描述
 *
 * @author jiaxiaofei
 * @date
 * @Modify
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jiaxiaofei
 * @date 2020/3/5 23:15
 * @version 1.0
 */
public class HellSLF {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HellSLF.class);
        logger.debug("debug");
        logger.info("info");
        logger.trace("trace");
        logger.warn("warn");
        logger.error("error");

        logger.info("你好，{},{}","贾晓飞","栾小黑");
        logger.trace("你好，{},{}","贾晓飞","栾小黑");

    }
}
