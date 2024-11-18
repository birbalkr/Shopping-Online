package com.example.shopping_Backenddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopping_Backenddemo.BookItem;
import com.example.shopping_Backenddemo.CarMotorbikeItem;
import com.example.shopping_Backenddemo.ComputerItem;
import com.example.shopping_Backenddemo.ElectronicItem;
import com.example.shopping_Backenddemo.FashionItem;
import com.example.shopping_Backenddemo.HomeKitchenItem;
import com.example.shopping_Backenddemo.MobileItem;
import com.example.shopping_Backenddemo.ProductItem;
import com.example.shopping_Backenddemo.SellItem;
import com.example.shopping_Backenddemo.SportsItem;
import com.example.shopping_Backenddemo.service.BookSerivce;
import com.example.shopping_Backenddemo.service.CarMotorbikeSerivce;
import com.example.shopping_Backenddemo.service.ComputerSerivce;
import com.example.shopping_Backenddemo.service.ElectronicSerivce;
import com.example.shopping_Backenddemo.service.FashionSerivce;
import com.example.shopping_Backenddemo.service.FitnessOutdoorSerivce;
import com.example.shopping_Backenddemo.service.HomeKitchenSerivce;
import com.example.shopping_Backenddemo.service.MobileSerivce;
import com.example.shopping_Backenddemo.service.ProductService;
import com.example.shopping_Backenddemo.service.SellService;
import com.example.shopping_Backenddemo.service.SportSerivce;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    BookSerivce bookSerivce;
    CarMotorbikeSerivce carMotorbikeSerivce;
    ComputerSerivce computerSerivce;
    ElectronicSerivce electronicSerivce;
    FashionSerivce fashionSerivce;
    FitnessOutdoorSerivce fitnessOutdoorSerivce;
    HomeKitchenSerivce homeKitchenSerivce;
    MobileSerivce mobileSerivce;
    SellService sellService;
    SportSerivce sportSerivce;

    @GetMapping("api/product")
    public List<ProductItem> getALLProduct() {
        return productService.readProducts();
    }

    // Corrected: Use @PathVariable instead of @RequestParam
    @GetMapping("api/product/{id}")
    public ProductItem getProductById(@PathVariable Long id) {
        return productService.readProduct(id);
    }

    @PostMapping("api/product")
    public String createProduct(@RequestBody ProductItem productItem) {
        return productService.createProduct(productItem);

    }

    @DeleteMapping("api/product/{id}")
    public String deleteProduct(@PathVariable Long id) {
        if (productService.deleteProduct(id))
            return "Delete Successfully";
        return "Not found";
    }

    @PutMapping("api/product/{id}")
    public String updateProduct(@PathVariable Long id, @RequestBody ProductItem productItem) {
        return productService.updateProduct(id, productItem);
    }

    // Book Controller code ******************************

    @GetMapping("api/book")
    public List<BookItem> getALLBook() {
        return bookSerivce.readBooks();
    }

    @GetMapping("api/book/{id}")
    public BookItem readBook(@PathVariable Long id) {
        return bookSerivce.readBook(id);
    }

    @PostMapping("api/book")
    public String createBook(@RequestBody BookItem bookItem) {
        return bookSerivce.createBook(bookItem);

    }

    @DeleteMapping("api/book/{id}")
    public String deleteBook(@PathVariable Long id) {
        if (bookSerivce.deleteBook(id))
            return "Delete Successfully";
        return "Not found";
    }

    @PutMapping("api/book/{id}")
    public String updateBook(@PathVariable Long id, @RequestBody BookItem bookItem) {
        return bookSerivce.updateBook(id, bookItem);
    }

    // ********* CarMotorbike Controller **********

    @GetMapping("api/carMotorbike")
    public List<CarMotorbikeItem> getALLCarMotorbike() {
        return carMotorbikeSerivce.readCarMotorbikes();
    }

    @GetMapping("api/carMotorbike/{id}")
    public CarMotorbikeItem readCarMotorbike(@PathVariable Long id) {
        return carMotorbikeSerivce.readCarMotorbike(id);
    }

    @PostMapping("api/carMotorbike")
    public String createCarMotorbike(@RequestBody CarMotorbikeItem carMotorbikeItem) {
        return carMotorbikeSerivce.createCarMotorbike(carMotorbikeItem);

    }

    @DeleteMapping("api/carMotorbike/{id}")
    public String deleteCarMotorbike(@PathVariable Long id) {
        if (carMotorbikeSerivce.deleteCarMotorbike(id))
            return "Delete Successfully";
        return "Not found";
    }

    @PutMapping("api/carMotorbike/{id}")
    public String updateCarMotorbike(@PathVariable Long id, @RequestBody CarMotorbikeItem carMotorbikeItem) {
        return carMotorbikeSerivce.updateCarMotorbike(id, carMotorbikeItem);
    }

    // ********* computerSerivce controller **********

    @GetMapping("api/computer")
    public List<ComputerItem> getALLComputer() {
        return computerSerivce.readComputers();
    }

    @GetMapping("api/computer/{id}")
    public ComputerItem readComputer(@PathVariable Long id) {
        return computerSerivce.readComputer(id);
    }

    @PostMapping("api/computer")
    public String createComputer(@RequestBody ComputerItem computerItem) {
        return computerSerivce.createComputer(computerItem);

    }

    @DeleteMapping("api/computer/{id}")
    public String deleteComputer(@PathVariable Long id) {
        if (computerSerivce.deleteComputer(id))
            return "Delete Successfully";
        return "Not found";
    }

    @PutMapping("api/computer/{id}")
    public String updateComputer(@PathVariable Long id, @RequestBody ComputerItem computerItem) {
        return computerSerivce.updateComputer(id, computerItem);
    }

    // ************* Electronic Controller ************

    @GetMapping("api/electronic")
    public List<ElectronicItem> getALLelectronic() {
        return electronicSerivce.readElectronics();
    }

    @GetMapping("api/electronic/{id}")
    public ElectronicItem readElectronic(@PathVariable Long id) {
        return electronicSerivce.readElectronic(id);
    }

    @PostMapping("api/electronic")
    public String createElectronic(@RequestBody ElectronicItem electronicItem) {
        return electronicSerivce.createElectronic(electronicItem);

    }

    @DeleteMapping("api/carMotorbike/{id}")
    public String deleteElectronic(@PathVariable Long id) {
        if (electronicSerivce.deleteElectronic(id))
            return "Delete Successfully";
        return "Not found";
    }

    @PutMapping("api/electronic/{id}")
    public String updateElectronic(@PathVariable Long id, @RequestBody ElectronicItem electronicItem) {
        return electronicSerivce.updateElectronic(id, electronicItem);
    }

    // ********* Fashion Controller *********

    @GetMapping("api/fashion")
    public List<FashionItem> getALLfashion() {
        return fashionSerivce.readFashions();
    }

    @GetMapping("api/fashion/{id}")
    public FashionItem readFashion(@PathVariable Long id) {
        return fashionSerivce.readFashion(id);
    }

    @PostMapping("api/fashion")
    public String createFashion(@RequestBody FashionItem fashionItem) {
        return fashionSerivce.createFashion(fashionItem);

    }

    @DeleteMapping("api/fashion/{id}")
    public String deleteFashion(@PathVariable Long id) {
        if (fashionSerivce.deleteFashion(id))
            return "Delete Successfully";
        return "Not found";
    }

    @PutMapping("api/fashion/{id}")
    public String updateFashion(@PathVariable Long id, @RequestBody FashionItem fashionItem) {
        return fashionSerivce.updateFashion(id, fashionItem);
    }

    // *********** HomeKitchen Controller ***********

    @GetMapping("api/homekitchen")
    public List<HomeKitchenItem> getALLHomeKitchen() {
        return homeKitchenSerivce.readHomes();
    }

    @GetMapping("api/homekitchen/{id}")
    public HomeKitchenItem readHome(@PathVariable Long id) {
        return homeKitchenSerivce.readHome(id);
    }

    @PostMapping("api/homekitchen")
    public String createHome(@RequestBody HomeKitchenItem homeKitchenItem) {
        return homeKitchenSerivce.createHome(homeKitchenItem);

    }

    @DeleteMapping("api/homekitchen/{id}")
    public String deleteHome(@PathVariable Long id) {
        if (homeKitchenSerivce.deleteHome(id))
            return "Delete Successfully";
        return "Not found";
    }

    @PutMapping("api/homekitchen/{id}")
    public String updateHome(@PathVariable Long id, @RequestBody HomeKitchenItem homeKitchenItem) {
        return homeKitchenSerivce.updateHome(id, homeKitchenItem);
    }

    // ************* Mobile controller **********

    @GetMapping("api/mobile")
    public List<MobileItem> getALLMobile() {
        return mobileSerivce.readMobiles();
    }

    @GetMapping("api/mobile/{id}")
    public MobileItem readMobile(@PathVariable Long id) {
        return mobileSerivce.readMobile(id);
    }

    @PostMapping("api/mobile")
    public String createMobile(@RequestBody MobileItem mobileItem) {
        return mobileSerivce.createMobile(mobileItem);

    }

    @DeleteMapping("api/mobile/{id}")
    public String deleteMobile(@PathVariable Long id) {
        if (mobileSerivce.deleteMobile(id))
            return "Delete Successfully";
        return "Not found";
    }

    @PutMapping("api/mobile/{id}")
    public String updateMobile(@PathVariable Long id, @RequestBody MobileItem mobileItem) {
        return mobileSerivce.updateMobile(id, mobileItem);
    }

    // *********** sell Controller ********

    @GetMapping("api/sell")
    public List<SellItem> getALLSell() {
        return sellService.readSells();
    }

    @GetMapping("api/sell/{id}")
    public SellItem readSell(@PathVariable Long id) {
        return sellService.readSell(id);
    }

    @PostMapping("api/sell")
    public String createSell(@RequestBody SellItem sellItem) {
        return sellService.createSell(sellItem);

    }

    @DeleteMapping("api/sell/{id}")
    public String deleteSell(@PathVariable Long id) {
        if (sellService.deleteSell(id))
            return "Delete Successfully";
        return "Not found";
    }

    @PutMapping("api/sell/{id}")
    public String updateSell(@PathVariable Long id, @RequestBody SellItem sellItem) {
        return sellService.updateSell(id, sellItem);
    }

    // ********** Sport controller **********

    @GetMapping("api/sport")
    public List<SportsItem> getALLSports() {
        return sportSerivce.readSports();
    }

    @GetMapping("api/sport/{id}")
    public SportsItem readSport(@PathVariable Long id) {
        return sportSerivce.readSport(id);
    }

    @PostMapping("api/sport")
    public String createSport(@RequestBody SportsItem sellItem) {
        return sportSerivce.createSport(sellItem);

    }

    @DeleteMapping("api/sport/{id}")
    public String deleteSport(@PathVariable Long id) {
        if (sportSerivce.deleteSport(id))
            return "Delete Successfully";
        return "Not found";
    }

    @PutMapping("api/sport/{id}")
    public String updateSport(@PathVariable Long id, @RequestBody SportsItem sportsItem) {
        return sportSerivce.updateSport(id, sportsItem);
    }

}
