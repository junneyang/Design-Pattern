package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * @author shadow
 * @Date 2016年8月13日下午8:21:03
 * @Fun  访问者(Visitor)模式  行为模式<br/>
 * 		 在不修改已有程序结构的前提下，通过添加额外的“访问者”来完成对已有代码功能的提升<br/>
 * 	  	 简单来说，访问者模式就是一种分离对象数据结构与行为的方法，通过这种分离，可达到为一个被访问者动态添加新的操作而无需做其他的修改的效果<br/>
 * 		缺点：添加新的元素类，比较困难，因为需要修改抽象访问者的接口及实现，违反开-闭原则<br/>
 **/
public class MainTest {
	public static void main(String[] args) {
		List<Flower> flowers = new ArrayList<>();
		
		for(int i = 0; i < 10; i++){
			flowers.add(FlowerGenerator.newFlower());
		}
		
		Visitor visitor = new StringVisitor();
		Iterator<Flower> iterator = flowers.iterator();
		while(iterator.hasNext()){
			iterator.next().accept(visitor);
			System.out.println(visitor);
		}
		System.out.println("-----------");
		
		visitor = new BeeVisitor();
		iterator = flowers.iterator();
		while(iterator.hasNext()){
			iterator.next().accept(visitor);
			System.out.println(visitor);
		}
	}
}

/**
 * 推荐博客：http://blog.csdn.net/zhengzhb/article/details/7489639
 * **/
