package cn.owem.wecare.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author Owem
 * @date 2022/12/7 11:20
 * @description TODO
 **/
@Data
public class Subscription {
    @TableId
    private Long subscriptionId;
    private String userId;
    @TableField(exist = false)
    private User user;
    private String acceptUserId;
    @TableField(exist = false)
    private User acceptUser;
    private Long channelId;
    @TableField(exist = false)
    private Channel channel;
    private String subscriptionTime;
    private Boolean isAccept;
}
