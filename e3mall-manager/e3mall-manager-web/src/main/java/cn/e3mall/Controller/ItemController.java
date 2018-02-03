package cn.e3mall.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;


@RestController // 此注解即将controller交给了springMVC管理,又将返回值转换成json格式
public class ItemController {

	@Autowired
	private ItemService itemService;

	@RequestMapping("/item/{itemId}")
	public TbItem findItemById(@PathVariable Long itemId) {
		return itemService.findItemById(itemId);
	}
}
