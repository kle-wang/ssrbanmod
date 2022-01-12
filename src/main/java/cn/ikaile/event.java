package cn.ikaile;/*
    @author kle_wang
    @2022/1/11
*/

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class event implements Listener {
    ArrayList<String> str1 =new ArrayList<String>();
    //点击盒子事件
    @EventHandler
    public void boxItem(InventoryClickEvent e) {
        Player p = (Player)e.getWhoClicked();
        ItemStack item = e.getCurrentItem();
        if(item==null){
            return;
        }
        if((item.getType().toString().equals("LASTSMITH_SLASHBLADENAMEDSS")||
                    item.getType().toString().equals("FLAMMPFEILSLASHBLADE_SLASHBLADEWRAPPER")||
                    item.getType().toString().equals("FLAMMPFEILSLASHBLADE_SLASHBLADENAMED")||
                    item.getType().toString().equals("LASTSMITH_EUBLADE")||
                    item.getType().toString().equals("LASTSMITH_VOIDBLADE")||
                    item.getType().toString().equals("LASTSMITH_WINDBLADE")||
                    item.getType().toString().equals("LASTSMITH_CRIMSONBLADE")||
                    item.getType().toString().equals("LASTSMITH_THAUMIUMBLADE"))
                    && (str1.contains(p.toString()))){
                e.setCancelled(true);
                p.sendMessage("请使用拔刀剑专用锻造台！");
            }
        }
    @EventHandler
    public void clickItem(PlayerInteractEvent e){
        Block item = e.getClickedBlock();
        Player p= e.getPlayer();
        if(item==null){
            return;
        }
        if(item.getType().toString().equals("ENDERIO_BLOCK_DARK_STEEL_ANVIL")||item.getType().toString().equals("INDUSTRIALFOREGOING_ENCHANTMENT_APLICATOR")){
            str1.add(p.toString());
        }

    }
    @EventHandler
    public void closeInv(InventoryCloseEvent e){
        Player p = (Player) e.getPlayer();
        str1.remove(p.toString());
    }
}
