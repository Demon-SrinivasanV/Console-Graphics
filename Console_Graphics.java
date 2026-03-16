// package com.github.Spectre_Graphics;
import java.io.*;
public class Console_Graphics // Author and Sponsor: Demon-SrinivasanV  @GitHub
{
    static byte anime;
    static void A(byte i)
    {
        if(i==1)
            System.out.print("    _    ");
        else if(i==2)
            System.out.print("   / \\   ");
        else if(i==3)
            System.out.print("  / _ \\  ");
        else if(i==4)
            System.out.print(" / ___ \\ ");
        else if(i==5)
            System.out.print("/_/   \\_\\");
        else if(i==6)
            System.out.print("         ");
        else
            System.out.print("-x-x-x-x-");
    }
    static void B(byte i)
    {
        if(i==1)
            System.out.print(" ____  ");
        else if(i==2)
            System.out.print("| __ ) ");
        else if(i==3)
            System.out.print("|  _ \\ ");
        else if(i==4)
            System.out.print("| |_) |");
        else if(i==5)
            System.out.print("|____/ ");
        else if(i==6)
            System.out.print("       ");
        else
        System.out.print("-x-x-x-");
    }
    static void C(byte i)
    {
        if(i==1)
            System.out.print("  ____ ");
        else if(i==2)
            System.out.print(" / ___|");
        else if(i==3)
            System.out.print("| |    ");
        else if(i==4)
            System.out.print("| |___ ");
        else if(i==5)
            System.out.print(" \\____|");
        else if(i==6)
            System.out.print("       ");
        else
            System.out.print("-x-x-x-");
    }
    static void D(byte i)
    {
        if(i==1)
            System.out.print(" ____  ");
        else if(i==2)
            System.out.print("|  _ \\ ");
        else if(i==3)
            System.out.print("| | | |");
        else if(i==4)
            System.out.print("| |_| |");
        else if(i==5)
            System.out.print("|____/ ");
        else if(i==6)
            System.out.print("       ");
        else   
        System.out.print("-x-x-x-");
    }
    static void E(byte i)
    {
        if(i==1)
            System.out.print(" _____ ");
        else if(i==2)
            System.out.print("| ____|");
        else if(i==3)
            System.out.print("|  _|  ");
        else if(i==4)
            System.out.print("| |___ ");
        else if(i==5)
            System.out.print("|_____|");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void F(byte i)
    {
        if(i==1)
            System.out.print(" _____ ");
        else if(i==2)
            System.out.print("|  ___|");
        else if(i==3)
            System.out.print("| |_   ");
        else if(i==4)
            System.out.print("|  _|  ");
        else if(i==5)
            System.out.print("|_|    ");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void G(byte i)
    {
        if(i==1)
            System.out.print("  ____ ");
        else if(i==2)
            System.out.print(" / ___|");
        else if(i==3)
            System.out.print("| |  _ ");
        else if(i==4)
            System.out.print("| |_| |");
        else if(i==5)
            System.out.print(" \\____|");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void H(byte i)
    {
        if(i==1)
            System.out.print(" _   _ ");
        else if(i==2)
            System.out.print("| | | |");
        else if(i==3)
            System.out.print("| |_| |");
        else if(i==4)
            System.out.print("|  _  |");
        else if(i==5)
            System.out.print("|_| |_|");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void I(byte i)
    {
        if(i==1)
            System.out.print(" ___ ");
        else if(i==2)
            System.out.print("|_ _|");
        else if(i==3)
            System.out.print(" | | ");
        else if(i==4)
            System.out.print(" | | ");
        else if(i==5)
            System.out.print("|___|");
        else if(i==6)
            System.out.print("     ");
        else   
            System.out.print("-x-x-");
    }
    static void J(byte i)
    {
        if(i==1)
            System.out.print("     _ ");
        else if(i==2)
            System.out.print("    | |");
        else if(i==3)
            System.out.print(" _  | |");
        else if(i==4)
            System.out.print("| |_| |");
        else if(i==5)
            System.out.print(" \\___/ ");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void K(byte i)
    {
        if(i==1)
            System.out.print(" _  __");
        else if(i==2)
            System.out.print("| |/ /");
        else if(i==3)
            System.out.print("| ' / ");
        else if(i==4)
            System.out.print("| . \\ ");
        else if(i==5)
            System.out.print("|_|\\_\\");
        else if(i==6)
            System.out.print("      ");
        else   
            System.out.print("-x-x-x");
    }
    static void L(byte i)
    {
        if(i==1)
            System.out.print( " _     ");
        else if(i==2)
            System.out.print("| |    ");
        else if(i==3)
            System.out.print("| |    ");
        else if(i==4)
            System.out.print("| |___ ");
        else if(i==5)
            System.out.print("|_____|");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void M(byte i)
    {
        if(i==1)
            System.out.print(" __  __ ");
        else if(i==2)
            System.out.print("|  \\/  |");
        else if(i==3)
            System.out.print("| |\\/| |");
        else if(i==4)
            System.out.print("| |  | |");
        else if(i==5)
            System.out.print("|_|  |_|");
        else if(i==6)
            System.out.print("        ");
        else   
            System.out.print("-x-x-x-x");
    }
    static void N(byte i)
    {
        if(i==1)
            System.out.print(" _   _ ");
        else if(i==2)
            System.out.print("| \\ | |");
        else if(i==3)
            System.out.print("|  \\| |");
        else if(i==4)
            System.out.print("| |\\  |");
        else if(i==5)
            System.out.print("|_| \\_|");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void O(byte i)
    {
        if(i==1)
            System.out.print("  ___  ");
        else if(i==2)
            System.out.print(" / _ \\ ");
        else if(i==3)
            System.out.print("| | | |");
        else if(i==4)
            System.out.print("| |_| |");
        else if(i==5)
            System.out.print(" \\___/ ");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void P(byte i)
    {
        if(i==1)
            System.out.print(" ____  ");
        else if(i==2)
            System.out.print("|  _ \\ ");
        else if(i==3)
            System.out.print("| |_) |");
        else if(i==4)
            System.out.print("|  __/ ");
        else if(i==5)
            System.out.print("|_|    ");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void Q(byte i)
    {
        if(i==1)
            System.out.print("  ___  ");
        else if(i==2)
            System.out.print(" / _ \\ ");
        else if(i==3)
            System.out.print("| | | |");
        else if(i==4)
            System.out.print("| |_| |");
        else if(i==5)
            System.out.print(" \\__\\_\\");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void R(byte i)
    {
        if(i==1)
            System.out.print(" ____  ");
        else if(i==2)
            System.out.print("|  _ \\ ");
        else if(i==3)
            System.out.print("| |_) |");
        else if(i==4)
            System.out.print("|  _ < ");
        else if(i==5)
            System.out.print("|_| \\_\\");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void S(byte i)
    {
        if(i==1)
            System.out.print(" ____  ");
        else if(i==2)
            System.out.print("/ ___| ");
        else if(i==3)
            System.out.print("\\___ \\ ");
        else if(i==4)
            System.out.print(" ___) |");
        else if(i==5)
            System.out.print("|____/ ");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void T(byte i)
    {
        if(i==1)
            System.out.print(" _____ ");
        else if(i==2)
            System.out.print("|_   _|");
        else if(i==3)
            System.out.print("  | |  ");
        else if(i==4)
            System.out.print("  | |  ");
        else if(i==5)
            System.out.print("  |_|  ");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void U(byte i)
    {
        if(i==1)
            System.out.print(" _   _ ");
        else if(i==2)
            System.out.print("| | | |");
        else if(i==3)
            System.out.print("| | | |");
        else if(i==4)
            System.out.print("| |_| |");
        else if(i==5)
            System.out.print(" \\___/ ");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void V(byte i)
    {
        if(i==1)
            System.out.print("__     __");
        else if(i==2)
            System.out.print("\\ \\   / /");
        else if(i==3)
            System.out.print(" \\ \\ / / ");
        else if(i==4)
            System.out.print("  \\ V /  ");
        else if(i==5)
            System.out.print("   \\_/   ");
        else if(i==6)
            System.out.print("         ");
        else   
            System.out.print("-x-x-x-x-");
    }
    static void W(byte i)
    {
        if(i==1)
            System.out.print("__        __");
        else if(i==2)
            System.out.print("\\ \\      / /");
        else if(i==3)
            System.out.print(" \\ \\ /\\ / / ");
        else if(i==4)
            System.out.print("  \\ V  V /  ");
        else if(i==5)
            System.out.print("   \\_/\\_/   ");
        else if(i==6)
            System.out.print("            ");
        else   
            System.out.print("-x-x-x-x-x-x");
    }
    static void X(byte i)
    {
        if(i==1)
            System.out.print("__  __");
        else if(i==2)
            System.out.print("\\ \\/ /");
        else if(i==3)
            System.out.print(" \\  / ");
        else if(i==4)
            System.out.print(" /  \\ ");
        else if(i==5)
            System.out.print("/_/\\_\\");
        else if(i==6)
            System.out.print("      ");
        else   
            System.out.print("-x-x-x");
    }
    static void Y(byte i)
    {
        if(i==1)
            System.out.print("__   __");
        else if(i==2)
            System.out.print("\\ \\ / /");
        else if(i==3)
            System.out.print(" \\ V / ");
        else if(i==4)
            System.out.print("  | |  ");
        else if(i==5)
            System.out.print("  |_|  ");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void Z(byte i)
    {
        if(i==1)
            System.out.print(" _____");
        else if(i==2)
            System.out.print("|__  /");
        else if(i==3)
            System.out.print("  / / ");
        else if(i==4)
            System.out.print(" / /_ ");
        else if(i==5)
            System.out.print("/____|");
        else if(i==6)
            System.out.print("      ");
        else   
            System.out.print("-x-x-x");
    }
    static void a(byte i)
    {
        if(i==1)
            System.out.print("       ");
        else if(i==2)
            System.out.print("  __ _ ");
        else if(i==3)
            System.out.print(" / _` |");
        else if(i==4)
            System.out.print("| (_| |");
        else if(i==5)
            System.out.print(" \\__,_|");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void b(byte i)
    {
        if(i==1)
            System.out.print(" _     ");
        else if(i==2)
            System.out.print("| |__  ");
        else if(i==3)
            System.out.print("| '_ \\ ");
        else if(i==4)
            System.out.print("| |_) |");
        else if(i==5)
            System.out.print("|_.__/ ");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void c(byte i)
    {
        if(i==1)
            System.out.print("      ");
        else if(i==2)
            System.out.print("  ___ ");
        else if(i==3)
            System.out.print(" / __|");
        else if(i==4)
            System.out.print("| (__ ");
        else if(i==5)
            System.out.print(" \\___|");
        else if(i==6)
            System.out.print("      ");
        else   
            System.out.print("-x-x-x");
    }
    static void d(byte i)
    {
        if(i==1)
            System.out.print("     _ ");
        else if(i==2)
            System.out.print("  __| |");
        else if(i==3)
            System.out.print(" / _` |");
        else if(i==4)
            System.out.print("| (_| |");
        else if(i==5)
            System.out.print(" \\__,_|");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void e(byte i)
    {
        if(i==1)
            System.out.print("      ");
        else if(i==2)
            System.out.print("  ___ ");
        else if(i==3)
            System.out.print(" / _ \\");
        else if(i==4)
            System.out.print("|  __/");
        else if(i==5)
            System.out.print(" \\___|");
        else if(i==6)
            System.out.print("      ");
        else   
            System.out.print("-x-x-x");
    }
    static void f(byte i)
    {
        if(i==1)
            System.out.print("  __ ");
        else if(i==2)
            System.out.print(" / _|");
        else if(i==3)
            System.out.print("| |_ ");
        else if(i==4)
            System.out.print("|  _|");
        else if(i==5)
            System.out.print("|_|  ");
        else if(i==6)
            System.out.print("     ");
        else   
            System.out.print("-x-x-");
    }
    static void g(byte i)
    {
        if(i==1)
            System.out.print("       ");
        else if(i==2)
            System.out.print("  __ _ ");
        else if(i==3)
            System.out.print(" / _` |");
        else if(i==4)
            System.out.print("| (_| |");
        else if(i==5)
            System.out.print(" \\__, |");
        else if(i==6)
            System.out.print(" |___/ ");
        else   
            System.out.print("-x-x-x-");
    }
    static void h(byte i)
    {
        if(i==1)
            System.out.print(" _     ");
        else if(i==2)
            System.out.print("| |__  ");
        else if(i==3)
            System.out.print("| '_ \\ ");
        else if(i==4)
            System.out.print("| | | |");
        else if(i==5)
            System.out.print("|_| |_|");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void i(byte i)
    {
        if(i==1)
            System.out.print(" _ ");
        else if(i==2)
            System.out.print("(_)");
        else if(i==3)
            System.out.print("| |");
        else if(i==4)
            System.out.print("| |");
        else if(i==5)
            System.out.print("|_|");
        else if(i==6)
            System.out.print("   ");
        else   
            System.out.print("-x-");
    }
    static void j(byte i)
    {
        if(i==1)
            System.out.print("   _ ");
        else if(i==2)
            System.out.print("  (_)");
        else if(i==3)
            System.out.print("  | |");
        else if(i==4)
            System.out.print("  | |");
        else if(i==5)
            System.out.print(" _/ |");
        else if(i==6)
            System.out.print("|__/ ");
        else   
            System.out.print("-x-x-");
    }
    static void k(byte i)
    {
        if(i==1)
            System.out.print(" _    ");
        else if(i==2)
            System.out.print("| | __");
        else if(i==3)
            System.out.print("| |/ /");
        else if(i==4)
            System.out.print("|   < ");
        else if(i==5)
            System.out.print("|_|\\_\\");
        else if(i==6)
            System.out.print("      ");
        else   
            System.out.print("-x-x-x");
    }
    static void l(byte i)
    {
        if(i==1)
            System.out.print(" _ ");
        else if(i==2)
            System.out.print("| |");
        else if(i==3)
            System.out.print("| |");
        else if(i==4)
            System.out.print("| |");
        else if(i==5)
            System.out.print("|_|");
        else if(i==6)
            System.out.print("   ");
        else   
            System.out.print("-x-");
    }
    static void m(byte i)
    {
        if(i==1)
            System.out.print("           ");
        else if(i==2)
            System.out.print(" _ __ ___  ");
        else if(i==3)
            System.out.print("| '_ ` _ \\ ");
        else if(i==4)
            System.out.print("| | | | | |");
        else if(i==5)
            System.out.print("|_| |_| |_|");
        else if(i==6)
            System.out.print("           ");
        else   
            System.out.print("-x-x-x-x-x-");
    }
    static void n(byte i)
    {
        if(i==1)
            System.out.print("       ");
        else if(i==2)
            System.out.print(" _ __  ");
        else if(i==3)
            System.out.print("| '_ \\ ");
        else if(i==4)
            System.out.print("| | | |");
        else if(i==5)
            System.out.print("|_| |_|");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void o(byte i)
    {
        if(i==1)
            System.out.print("       ");
        else if(i==2)
            System.out.print("  ___  ");
        else if(i==3)
            System.out.print(" / _ \\ ");
        else if(i==4)
            System.out.print("| (_) |");
        else if(i==5)
            System.out.print(" \\___/ ");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void p(byte i)
    {
        if(i==1)
            System.out.print("       ");
        else if(i==2)
            System.out.print(" _ __  ");
        else if(i==3)
            System.out.print("| '_ \\ ");
        else if(i==4)
            System.out.print("| |_) |");
        else if(i==5)
            System.out.print("| .__/ ");
        else if(i==6)
            System.out.print("|_|    ");
        else   
            System.out.print("-x-x-x-");
    }
    static void q(byte i)
    {
        if(i==1)
            System.out.print("       ");
        else if(i==2)
            System.out.print("  __ _ ");
        else if(i==3)
            System.out.print(" / _` |");
        else if(i==4)
            System.out.print("| (_| |");
        else if(i==5)
            System.out.print(" \\__, |");
        else if(i==6)
            System.out.print("    |_|");
        else   
            System.out.print("-x-x-x-");
    }
    static void r(byte i)
    {
        if(i==1)
            System.out.print("      ");
        else if(i==2)
            System.out.print(" _ __ ");
        else if(i==3)
            System.out.print("| '__|");
        else if(i==4)
            System.out.print("| |   ");
        else if(i==5)
            System.out.print("|_|   ");
        else if(i==6)
            System.out.print("      ");
        else   
            System.out.print("-x-x-x");
    }
    static void s(byte i)
    {
        if(i==1)
            System.out.print("     ");
        else if(i==2)
            System.out.print(" ___ ");
        else if(i==3)
            System.out.print("/ __|");
        else if(i==4)
            System.out.print("\\__ \\");
        else if(i==5)
            System.out.print("|___/");
        else if(i==6)
            System.out.print("     ");
        else   
            System.out.print("-x-x-");
    }
    static void t(byte i)
    {
        if(i==1)
            System.out.print(" _   ");
        else if(i==2)
            System.out.print("| |_ ");
        else if(i==3)
            System.out.print("| __|");
        else if(i==4)
            System.out.print("| |_ ");
        else if(i==5)
            System.out.print(" \\__|");
        else if(i==6)
            System.out.print("     ");
        else   
            System.out.print("-x-x-");
    }
    static void u(byte i)
    {
        if(i==1)
            System.out.print("       ");
        else if(i==2)
            System.out.print(" _   _ ");
        else if(i==3)
            System.out.print("| | | |");
        else if(i==4)
            System.out.print("| |_| |");
        else if(i==5)
            System.out.print(" \\__,_|");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void v(byte i)
    {
        if(i==1)
            System.out.print("       ");
        else if(i==2)
            System.out.print("__   __");
        else if(i==3)
            System.out.print("\\ \\ / /");
        else if(i==4)
            System.out.print(" \\ V / ");
        else if(i==5)
            System.out.print("  \\_/  ");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void w(byte i)
    {
        if(i==1)
            System.out.print("          ");
        else if(i==2)
            System.out.print("__      __");
        else if(i==3)
            System.out.print("\\ \\ /\\ / /");
        else if(i==4)
            System.out.print(" \\ V  V / ");
        else if(i==5)
            System.out.print("  \\_/\\_/  ");
        else if(i==6)
            System.out.print("          ");
        else   
            System.out.print("-x-x-x-x-x");
    }
    static void x(byte i)
    {
        if(i==1)
            System.out.print("      ");
        else if(i==2)
            System.out.print("__  __");
        else if(i==3)
            System.out.print("\\ \\/ /");
        else if(i==4)
            System.out.print(" >  < ");
        else if(i==5)
            System.out.print("/_/\\_\\");
        else if(i==6)
            System.out.print("      ");
        else   
            System.out.print("-x-x-x");
    }
    static void y(byte i)
    {
        if(i==1)
            System.out.print("       ");
        else if(i==2)
            System.out.print(" _   _ ");
        else if(i==3)
            System.out.print("| | | |");
        else if(i==4)
            System.out.print("| |_| |");
        else if(i==5)
            System.out.print(" \\__, |");
        else if(i==6)
            System.out.print(" |___/ " );
        else   
            System.out.print("-x-x-x-");
    }
    static void z(byte i)
    {
        if(i==1)
            System.out.print("     ");
        else if(i==2)
            System.out.print(" ____");
        else if(i==3)
            System.out.print("|_  /");
        else if(i==4)
            System.out.print(" / / ");
        else if(i==5)
            System.out.print("/___|");
        else if(i==6)
            System.out.print("     ");
        else   
            System.out.print("-x-x-");
    }
    static void No_0(byte i)
    {
        if(i==1)
            System.out.print("  ___  ");
        else if(i==2)
            System.out.print(" / _ \\ ");
        else if(i==3)
            System.out.print("| | | |");
        else if(i==4)
            System.out.print("| | | |");
        else if(i==5)
            System.out.print("| |_| |");
        else if(i==6)
            System.out.print(" \\___/ ");
        else   
            System.out.print("-x-x-x-");
    }
    static void No_1(byte i)
    {
        if(i==1)
            System.out.print(" _ ");
        else if(i==2)
            System.out.print("/ |");
        else if(i==3)
            System.out.print("| |");
        else if(i==4)
            System.out.print("| |");
        else if(i==5)
            System.out.print("| |");
        else if(i==6)
            System.out.print("|_|");
        else   
            System.out.print("-x-");
    }
    static void No_2(byte i)
    {
        if(i==1)
            System.out.print(" ____  ");
        else if(i==2)
            System.out.print("|___ \\ ");
        else if(i==3)
            System.out.print("  __) |");
        else if(i==4)
            System.out.print(" / __/ ");
        else if(i==5)
            System.out.print("| |___ ");
        else if(i==6)
            System.out.print("|_____|");
        else   
            System.out.print("-x-x-x-");
    }
    static void No_3(byte i)
    {
        if(i==1)
            System.out.print(" ______");
        else if(i==2)
            System.out.print("|___  /");
        else if(i==3)
            System.out.print("   / / ");
        else if(i==4)
            System.out.print("  |_ \\ ");
        else if(i==5)
            System.out.print(" ___) |");
        else if(i==6)
            System.out.print("|____/ ");
        else   
            System.out.print("-x-x-x-");
    }
    static void No_4(byte i)
    {
        if(i==1)
            System.out.print(" _  _   ");
        else if(i==2)
            System.out.print("| || |  ");
        else if(i==3)
            System.out.print("| || |_ ");
        else if(i==4)
            System.out.print("|__   _|");
        else if(i==5)
            System.out.print("   | |  ");
        else if(i==6)
            System.out.print("   |_|  ");
        else   
            System.out.print("-x-x-x-x");
    }
    static void No_5(byte i)
    {
        if(i==1)
            System.out.print(" _____ ");
        else if(i==2)
            System.out.print("|  ___|");
        else if(i==3)
            System.out.print("| |___ ");
        else if(i==4)
            System.out.print("|___  \\");
        else if(i==5)
            System.out.print(" ___) |");
        else if(i==6)
            System.out.print("|_____/");
        else   
            System.out.print("-x-x-x-");
    }
    static void No_6(byte i)
    {
        if(i==1)
            System.out.print("   __  ");
        else if(i==2)
            System.out.print("  / /  ");
        else if(i==3)
            System.out.print(" / /_  ");
        else if(i==4)
            System.out.print("| '_ \\ ");
        else if(i==5)
            System.out.print("| (_) |");
        else if(i==6)
            System.out.print(" \\___/ ");
        else   
            System.out.print("-x-x-x-");
    }
    static void No_7(byte i)
    {
        if(i==1)
            System.out.print(" _____ ");
        else if(i==2)
            System.out.print("|___  |");
        else if(i==3)
            System.out.print("   / / ");
        else if(i==4)
            System.out.print("  / /  ");
        else if(i==5)
            System.out.print(" / /   ");
        else if(i==6)
            System.out.print("/_/    ");
        else   
            System.out.print("-x-x-x-");
    }
    static void No_8(byte i)
    {
        if(i==1)
            System.out.print("  ___  ");
        else if(i==2)
            System.out.print(" / _ \\ ");
        else if(i==3)
            System.out.print("| (_) |");
        else if(i==4)
            System.out.print(" > _ < ");
        else if(i==5)
            System.out.print("| (_) |");
        else if(i==6)
            System.out.print(" \\___/ ");
        else   
            System.out.print("-x-x-x-");
    }
    static void No_9(byte i)
    {
        if(i==1)
            System.out.print("  ___  ");
        else if(i==2)
            System.out.print(" / _ \\ ");
        else if(i==3)
            System.out.print("| (_) |");
        else if(i==4)
            System.out.print(" \\__, |");
        else if(i==5)
            System.out.print("   / / ");
        else if(i==6)
            System.out.print("  /_/  ");
        else   
            System.out.print("-x-x-x-");
    }
    static void Tilde(byte i)
    {
        if(i==1)
            System.out.print(" /\\/|");
        else if(i==2)
            System.out.print("|/\\/ ");
        else if(i==3)
            System.out.print("     ");
        else if(i==4)
            System.out.print("     ");
        else if(i==5)
            System.out.print("     ");
        else if(i==6)
            System.out.print("     ");
        else   
            System.out.print("-x-x-");
    }
    static void Acute(byte i)
    {
        if(i==1)
            System.out.print(" _ ");
        else if(i==2)
            System.out.print("( )");
        else if(i==3)
            System.out.print(" \\|");
        else if(i==4)
            System.out.print("   ");
        else if(i==5)
            System.out.print("   ");
        else if(i==6)
            System.out.print("   ");
        else   
            System.out.print("-x-");
    }
    static void Exclamation(byte i)
    {
        if(i==1)
            System.out.print(" _ ");
        else if(i==2)
            System.out.print("| |");
        else if(i==3)
            System.out.print("| |");
        else if(i==4)
            System.out.print("| |");
        else if(i==5)
            System.out.print("|_|");
        else if(i==6)
            System.out.print("(_)");
        else   
            System.out.print("-x-");
    }
    static void Ampersat(byte i)
    {
        if(i==1)
            System.out.print("   ____  ");
        else if(i==2)
            System.out.print("  / __ \\ ");
        else if(i==3)
            System.out.print(" / / _` |");
        else if(i==4)
            System.out.print("| | (_| |");
        else if(i==5)
            System.out.print(" \\ \\__,_|");
        else if(i==6)
            System.out.print("  \\____/ ");
        else   
            System.out.print("-x-x-x-x-");
    }
    static void Octothorpe(byte i)
    {
        if(i==1)
            System.out.print("   _   _   ");
        else if(i==2)
            System.out.print(" _| |_| |_ ");
        else if(i==3)
            System.out.print("|_   _   _|");
        else if(i==4)
            System.out.print(" _| |_| |_ ");
        else if(i==5)
            System.out.print("|_   _   _|");
        else if(i==6)
            System.out.print("  |_| |_|  ");
        else   
            System.out.print("-x-x-x-x-x-");
    }
    static void Rupees(byte i)
    {
        if(i==1)
            System.out.print(" ______ ");
        else if(i==2)
            System.out.print("|__  __|");
        else if(i==3)
            System.out.print(" __) )_ ");
        else if(i==4)
            System.out.print("|_  ___|");
        else if(i==5)
            System.out.print("  \\ \\   ");
        else if(i==6)
            System.out.print("   \\_\\  ");
        else   
            System.out.print("-x-x-x-x");
    }
    static void Sterling(byte i)
    {
        if(i==1)
            System.out.print("  _____  ");
        else if(i==2)
            System.out.print(" (_  __) ");
        else if(i==3)
            System.out.print(" _/ /_   ");
        else if(i==4)
            System.out.print("(_   _)_ ");
        else if(i==5)
            System.out.print(" _| |_/ )");
        else if(i==6)
            System.out.print("(______/ ");
        else   
            System.out.print("-x-x-x-x-");
    }
    static void Euro(byte i)
    {
        if(i==1)
            System.out.print("  _____  ");
        else if(i==2)
            System.out.print(" / ___ \\ ");
        else if(i==3)
            System.out.print("| |__ \\_)");
        else if(i==4)
            System.out.print("(  __) _ ");
        else if(i==5)
            System.out.print("| |___/ )");
        else if(i==6)
            System.out.print(" \\_____/ ");
        else   
            System.out.print("-x-x-x-x-");
    }
    static void Dollar(byte i)
    {
        if(i==1)
            System.out.print("   _   ");
        else if(i==2)
            System.out.print(" _| |_ ");
        else if(i==3)
            System.out.print("/ ____)");
        else if(i==4)
            System.out.print("\\____ \\");
        else if(i==5)
            System.out.print("(_   _/");
        else if(i==6)
            System.out.print("  |_|  ");
        else   
            System.out.print("-x-x-x-");
    }
    static void Cent(byte i)
    {
        if(i==1)
            System.out.print("    _   ");
        else if(i==2)
            System.out.print("  _| |_ ");
        else if(i==3)
            System.out.print(" / ____)");
        else if(i==4)
            System.out.print("( (____ ");
        else if(i==5)
            System.out.print(" \\_   _)");
        else if(i==6)
            System.out.print("   |_|  ");
        else   
            System.out.print("-x-x-x-x");
    }
    static void Yuan(byte i)
    {
        if(i==1)
            System.out.print(" __   __ ");
        else if(i==2)
            System.out.print(" \\ \\ / / ");
        else if(i==3)
            System.out.print(" _\\ V /_ ");
        else if(i==4)
            System.out.print("(__| |__)");
        else if(i==5)
            System.out.print("(__| |__)");
        else if(i==6)
            System.out.print("   |_|   ");
        else   
            System.out.print("-x-x-x-x-");
    }
    static void Micro(byte i)
    {
        if(i==1)
            System.out.print(" ____ "); 
        else if(i==2)
            System.out.print("/ ___|");
        else if(i==3)
            System.out.print("\\    \\");
        else if(i==4)
            System.out.print("/ () /");
        else if(i==5)
            System.out.print("\\___ \\");
        else if(i==6)
            System.out.print("|____/");
        else
            System.out.print("-x-x-x");
    }
    static void Percent(byte i)
    {
        if(i==1)
            System.out.print(" _   __");
        else if(i==2)
            System.out.print("(_) / /");
        else if(i==3)
            System.out.print("   / / ");
        else if(i==4)
            System.out.print("  / /  ");
        else if(i==5)
            System.out.print(" / / _ ");
        else if(i==6)
            System.out.print("/_/ (_)");
        else   
            System.out.print("-x-x-x-");
    }
    static void Degree(byte i)
    {
        if(i==1)
            System.out.print(" _ ");
        else if(i==2)
            System.out.print("/ \\");
        else if(i==3)
            System.out.print("|@|");
        else if(i==4)
            System.out.print("\\_/");
        else if(i==5)
            System.out.print("   ");
        else if(i==6)
            System.out.print("   ");
        else   
            System.out.print("-x-");
    }
    static void Caret(byte i)
    {
        if(i==1)
            System.out.print(" /\\ ");
        else if(i==2)
            System.out.print("|/\\|");
        else if(i==3)
            System.out.print("    ");
        else if(i==4)
            System.out.print("    ");
        else if(i==5)
            System.out.print("    ");
        else if(i==6)
            System.out.print("    ");
        else   
            System.out.print("-x-x");
    }
    static void Ampersand(byte i)
    {
        if(i==1)
            System.out.print("  ___   ");
        else if(i==2)
            System.out.print(" ( _ )  ");
        else if(i==3)
            System.out.print(" / _ \\/\\");
        else if(i==4)
            System.out.print("| (_>  <");
        else if(i==5)
            System.out.print(" \\___/\\/");
        else if(i==6)
            System.out.print("        ");
        else   
            System.out.print("-x-x-x-x");
    }
    static void Asterisk(byte i)
    {
        if(i==1)
            System.out.print("__/\\__");
        else if(i==2)
            System.out.print("\\    /");
        else if(i==3)
            System.out.print("/_  _\\");
        else if(i==4)
            System.out.print("  \\/  ");
        else if(i==5)
            System.out.print("      ");
        else if(i==6)
            System.out.print("      ");
        else   
            System.out.print("-x-x-x");
    }
    static void Left_Parenthesis(byte i)
    {
        if(i==1)
            System.out.print("  __");
        else if(i==2)
            System.out.print(" / /");
        else if(i==3)
            System.out.print("| | ");
        else if(i==4)
            System.out.print("| | ");
        else if(i==5)
            System.out.print("| | ");
        else if(i==6)
            System.out.print(" \\_\\");
        else   
            System.out.print("-x-x");
    }
    static void Right_Parenthesis(byte i)
    {
        if(i==1)
            System.out.print("__  ");
        else if(i==2)
            System.out.print("\\ \\ ");
        else if(i==3)
            System.out.print(" | |");
        else if(i==4)
            System.out.print(" | |");
        else if(i==5)
            System.out.print(" | |");
        else if(i==6)
            System.out.print("/_/ ");
        else   
            System.out.print("-x-x");
    }
    static void Hyphen(byte i)
    {
        if(i==1)
            System.out.print("       ");
        else if(i==2)
            System.out.print("       ");
        else if(i==3)
            System.out.print(" _____ ");
        else if(i==4)
            System.out.print("|_____|");
        else if(i==5)
            System.out.print("       ");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void Underscore(byte i)
    {
        if(i==1)
            System.out.print("       ");
        else if(i==2)
            System.out.print("       ");
        else if(i==3)
            System.out.print("       ");
        else if(i==4)
            System.out.print("       ");
        else if(i==5)
            System.out.print(" _____ ");
        else if(i==6)
            System.out.print("|_____|");
        else   
            System.out.print("-x-x-x-");
    }
    static void Plus(byte i)
    {
        if(i==1)
            System.out.print("       ");
        else if(i==2)
            System.out.print("   _   ");
        else if(i==3)
            System.out.print(" _| |_ ");
        else if(i==4)
            System.out.print("|_   _|");
        else if(i==5)
            System.out.print("  |_|  ");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void Equal(byte i)
    {
        if(i==1)
            System.out.print("       ");
        else if(i==2)
            System.out.print(" _____ ");
        else if(i==3)
            System.out.print("|_____|");
        else if(i==4)
            System.out.print("|_____|");
        else if(i==5)
            System.out.print("       ");
        else if(i==6)
            System.out.print("       ");
        else   
            System.out.print("-x-x-x-");
    }
    static void Left_Brace(byte i)
    {
        if(i==1)
            System.out.print("   __");
        else if(i==2)
            System.out.print("  / /");
        else if(i==3)
            System.out.print(" | | ");
        else if(i==4)
            System.out.print("< <  ");
        else if(i==5)
            System.out.print(" | | ");
        else if(i==6)
            System.out.print("  \\_\\");
        else   
            System.out.print("-x-x-");
    }
    static void Right_Brace(byte i)
    {
        if(i==1)
            System.out.print("__   ");
        else if(i==2)
            System.out.print("\\ \\  ");
        else if(i==3)
            System.out.print(" | | ");
        else if(i==4)
            System.out.print("  > >");
        else if(i==5)
            System.out.print(" | | ");
        else if(i==6)
            System.out.print("/_/  ");
        else   
            System.out.print("-x-x-");
    }
    static void Left_Braket(byte i)
    {
        if(i==1)
            System.out.print(" ___ ");
        else if(i==2)
            System.out.print("|  _|");
        else if(i==3)
            System.out.print("| |  ");
        else if(i==4)
            System.out.print("| |  ");
        else if(i==5)
            System.out.print("| |_ ");
        else if(i==6)
            System.out.print("|___|");
        else   
            System.out.print("-x-x-");
    }
    static void Right_Braket(byte i)
    {
        if(i==1)
            System.out.print(" ___ ");
        else if(i==2)
            System.out.print("|_  |");
        else if(i==3)
            System.out.print("  | |");
        else if(i==4)
            System.out.print("  | |");
        else if(i==5)
            System.out.print(" _| |");
        else if(i==6)
            System.out.print("|___|");
        else   
            System.out.print("-x-x-");
    }
    static void Pipe(byte i)
    {
        if(i==1)
            System.out.print(" _ ");
        else if(i==2)
            System.out.print("| |");
        else if(i==3)
            System.out.print("| |");
        else if(i==4)
            System.out.print("| |");
        else if(i==5)
            System.out.print("| |");
        else if(i==6)
            System.out.print("|_|");
        else   
            System.out.print("-x-");
    }
    static void Back_Slash(byte i)
    {
        if(i==1)
            System.out.print("__     ");
        else if(i==2)
            System.out.print("\\ \\    ");
        else if(i==3)
            System.out.print(" \\ \\   ");
        else if(i==4)
            System.out.print("  \\ \\  ");
        else if(i==5)
            System.out.print("   \\ \\ ");
        else if(i==6)
            System.out.print("    \\_\\");
        else   
            System.out.print("-x-x-x-");
    }
    static void Forward_Slash(byte i)
    {
        if(i==1)
            System.out.print("     __");
        else if(i==2)
            System.out.print("    / /");
        else if(i==3)
            System.out.print("   / / ");
        else if(i==4)
            System.out.print("  / /  ");
        else if(i==5)
            System.out.print(" / /   ");
        else if(i==6)
            System.out.print("/_/    ");
        else   
            System.out.print("-x-x-x-");
    }
    static void Colon(byte i)
    {
        if(i==1)
            System.out.print("   ");
        else if(i==2)
            System.out.print(" _ ");
        else if(i==3)
            System.out.print("(_)");
        else if(i==4)
            System.out.print(" _ ");
        else if(i==5)
            System.out.print("(_)");
        else if(i==6)
            System.out.print("   ");
        else   
            System.out.print("-x-");
    }
    static void Semicolon(byte i)
    {
        if(i==1)
            System.out.print("   ");
        else if(i==2)
            System.out.print(" _ ");
        else if(i==3)
            System.out.print("(_)");
        else if(i==4)
            System.out.print(" _ ");
        else if(i==5)
            System.out.print("( )");
        else if(i==6)
            System.out.print("|/ ");
        else   
            System.out.print("-x-");
    }
    static void Quotation_Mark(byte i)
    {
        if(i==1)
            System.out.print(" _ _ ");
        else if(i==2)
            System.out.print("( | )");
        else if(i==3)
            System.out.print(" V V ");
        else if(i==4)
            System.out.print("     ");
        else if(i==5)
            System.out.print("     ");
        else if(i==6)
            System.out.print("     ");
        else   
            System.out.print("-x-x-");
    }
    static void Apostrophe(byte i)
    {
        if(i==1)
            System.out.print(" _ ");
        else if(i==2)
            System.out.print("( )");
        else if(i==3)
            System.out.print("|/ ");
        else if(i==4)
            System.out.print("   ");
        else if(i==5)
            System.out.print("   ");
        else if(i==6)
            System.out.print("   ");
        else   
            System.out.print("-x-");
    }
    static void Left_Angle_Brakets(byte i)
    {
        if(i==1)
            System.out.print("  __");
        else if(i==2)
            System.out.print(" / /");
        else if(i==3)
            System.out.print("/ / ");
        else if(i==4)
            System.out.print("\\ \\ ");
        else if(i==5)
            System.out.print(" \\_\\");
        else if(i==6)
            System.out.print("    ");
        else   
            System.out.print("-x-x");
    }
    static void Right_Angle_Brakets(byte i)
    {
        if(i==1)
            System.out.print("__  ");
        else if(i==2)
            System.out.print("\\ \\ ");
        else if(i==3)
            System.out.print(" \\ \\");
        else if(i==4)
            System.out.print(" / /");
        else if(i==5)
            System.out.print("/_/ ");
        else if(i==6)
            System.out.print("    ");
        else   
            System.out.print("-x-x");
    }
    static void Comma(byte i)
    {
        if(i==1)
            System.out.print("   ");
        else if(i==2)
            System.out.print("   ");
        else if(i==3)
            System.out.print("   ");
        else if(i==4)
            System.out.print(" _ ");
        else if(i==5)
            System.out.print("( )");
        else if(i==6)
            System.out.print("|/ ");
        else   
            System.out.print("-x-");
    }
    static void Period(byte i)
    {
        if(i==1)
            System.out.print("   ");
        else if(i==2)
            System.out.print("   ");
        else if(i==3)
            System.out.print("   ");
        else if(i==4)
            System.out.print(" _ ");
        else if(i==5)
            System.out.print("(_)");
        else if(i==6)
            System.out.print("   ");
        else   
            System.out.print("-x-");
    }
    static void Question_Mark(byte i)
    {
        if(i==1)
            System.out.print(" ___ ");
        else if(i==2)
            System.out.print("|__ \\");
        else if(i==3)
            System.out.print("  / /");
        else if(i==4)
            System.out.print(" | | ");
        else if(i==5)
            System.out.print(" |_| ");
        else if(i==6)
            System.out.print(" (_) ");
        else   
            System.out.print("-x-x-");
    }
    static void Space_Bar(byte i)
    {
        if(i==1)
            System.out.print("     ");
        else if(i==2)
            System.out.print("     ");
        else if(i==3)
            System.out.print("     ");
        else if(i==4)
            System.out.print("     ");
        else if(i==5)
            System.out.print("     ");
        else if(i==6)
            System.out.print("     ");
        else   
            System.out.print("-x-x-");
    }
    static void Character_Error(byte i)
    {
        if(i==1)
            System.out.print("-x-x-x-x-x-");
        else if(i==2)
            System.out.print("-x- ___ -x-");
        else if(i==3)
            System.out.print("-x-|_  )-x-");
        else if(i==4)
            System.out.print("-x- |_| -x-");
        else if(i==5)
            System.out.print("-x- (_) -x-");
        else if(i==6)
            System.out.print("-x-x-x-x-x-");
        else   
            System.out.print("-x-x-x-x-x-");
    }
    public static void Load_Animation(int i)
    {
        try
        {
            for(int j = 0 ; j<=100 ; j++)
            {
                switch(anime)
                {
                    case 1:
                        System.out.print("\r[ \\ ] :" + j + "%");
                        break;
                    case 2:
                        System.out.print("\r[ | ] :" + j + "%");
                        break;
                    case 3:
                        System.out.print("\r[ / ] :" + j + "%");
                        break;
                    default:
                        anime = 0;
                        System.out.print("\r[ - ] :" + j + "%");
                }
                anime++;
                Thread.sleep(i);
            }
        }
        catch(InterruptedException e){}
    }
    public static void Hitman()
    {
        Load_Animation(10);
        System.out.println("\n              ,\n             /|  ,\n           , \\\\  \\`.\n        ,'/  ||   ) `.\n      ,' (   //,-'_,-'    ,\n.    `-._`-.  |  (_____,-'/\n\\`-._____)  | | ,-'-.    /\n \\    ,-'-. | |/     ) ,'\n  `. (     \\|     _,','\n    `.`._");
        System.out.println();
    }
    public static void Lara_Croft()
    {
        Load_Animation(50);
        System.out.println("\n                     Lara Croft\n\n        .s$P*.s$$$s.`*T$$b T TP$P.d$P .sd$s.                \n      .s$P .s$$$$$$$b. T$$b T:P d$$P.d$$$$$$bs.             \n     d$$P d$$$$P'`T$$$b $$$;:$bd$$$$$$b`T$$*$$$b.           \n    d$$P d$$$P' .+. *$$:$$$;.$$$P^*\"\"*^b.$$b T$$$b          \n   d$P .d$$$b.s$$$$$b TP^TP dP',d$$$$$s.`T$$b T$$$b         \n  d$P d$$P T$$$P*\"\"*^b.b d,P^*\"*^T$$$$$$$b`T$b$$$$$.        \n ,$P d$P .$$$P'       `'*`        `T$$$$$$$b`T$$$$$$         \n :$ d$P d$$$P                       `T$$$$$$b TPT$$$b        \n:$$d$$ d$$$P                          T$$$$$$b T.`T$$;       \n:$$$$$d$$$P                            T$$$$ $b T.T$$:       \n$$$$$P$$$$                              T$$$$T$b T `T$       \n$P$$$;$$$;                               T$^$b Tb b :$       \n$`$$$ $$$;                                T.T$b TY$,:$       \n$:$$$ $$$'                                `$ T$; $$;'$       \n$;$$$;$$$                                  `b T; $$$ $       \n$:T$$;$$$  .d$$s.                    .s$$b..$;:$;$$$.T       \n/ __`*:$$$ *'   `*Tb._            _.dP*'   `*$;:$:$P__ \\      \n..' .`.:$$$         `*Ts'        `sP*'        $$:$$P'. `,,     \n;  /   ,$$;   .+s**s.   `.           .s**s+.  T$:PP'  \\  :     \n: ,   /:$$;   \\ *ss* \\    ;         / *ss* /    +: \\   . ;     \n.`  :  $$;,  .+s$$$s+.            .+s$$$s+.  .* ;  ;  ',      \n\\   *.:$$,*d$P*\"$$$T$b  ,+**+,  d$P*\"$$$T$b*   .*    /       \n \\    `$$;:$; +:$$$:$$;*      *:$; +:$$$:$$;  :     /        \n       $$; T$b._$$$d$P          T$b._$$$d$P   ;              \n   `._.:$$, `*T$$$P*'            `*T$$$P*'    :._.'          \n       |$$;             '                     |P$$b.         \n       ;`$$,           :.     ,               :b.`T$b        \n       ` T$$b._        `*.__.*'               d$$b T$b       \n        . *TP*'           \"\"                 d$$$$b.:$;      \n         \\                                  dP T$$$$$$$      \n          \\          .+*\"*--*\"*+.          d$b. T$$^$$$      \n           `.       :._.--..--._.;       .'$$$$; $$ $$$      \n             ;.      `.        .'      .'  $$$$$ $P $$;      \n             : `.      `*----*'      .'    $$$$$ $b $P       \n             |   `.                .'      $$$$$Y$$dP        \n             :     `.            .'        :T$$P$$P,db.      \n            /        `-.      .-'          dbT d$Pd$$$$b.    \n           /            `****'            d$$$PT$$$b T$$$b   \n         .'                              d$$$P db`T$b T$$$b  \n      _.'                               :$$$P.d$$b:$$$`$$$$; \n _.-*' `.                               $$$$:$$$$$;$$$:$$$$$ \n         `-.                            :$$$;$$$$$$$$$;$$$$$ \n            `-.                        .-T$$$$P$$$$$P d$$$$; \n               `.     `.     .*      .'   T$$$b`T$P.sd$$$$P  \n                 `.     `-  '      .'      `T$$b$$$$$$$$P'   \n                   `.            .'          `T.T$$$$P$$$b.  \n                     `.        .'             :$$$$P'd$$$$$;  \n                       `.    .'               $$$$$:d$;$$$$$.\n                         `..'                 :$$$$;$$$b`T$$;\n                                               T$$$:$$$$; $$$\n                                                T$$$T$$$;d$$;\n                                                 `T$b`T$$$$P \n                                                   `*b T$P'");
        System.out.println();
    }
    public static void Mortal_Kombat()
    {
        Load_Animation(20);
        System.out.println("\n\n                       _..gggggppppp.._                       \n                  _.gd$$$$$$$$$$$$$$$$$$bp._                  \n               .g$$$$$$P^^\"\"j$$b\"\"\"\"^^T$$$$$$p.               \n            .g$$$P^T$$b    d$P T;       \"\"^^T$$$p.            \n          .d$$P^\"  :$; `  :$;                \"^T$$b.          \n        .d$$P'      T$b.   T$b                  `T$$b.        \n       d$$P'      .gg$$$$bpd$$$p.d$bpp.           `T$$b       \n      d$$P      .d$$$$$$$$$$$$$$$$$$$$bp.           T$$b      \n     d$$P      d$$$$$$$$$$$$$$$$$$$$$$$$$b.          T$$b     \n    d$$P      d$$$$$$$$$$$$$$$$$$P^^T$$$$P            T$$b    \n   d$$P    '-'T$$$$$$$$$$$$$$$$$$bggpd$$$$b.           T$$b   \n  :$$$      .d$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$p._.g.     $$$;  \n  $$$;     d$$$$$$$$$$$$$$$$$$$$$$$P^\"^T$$$$P^^T$$$;    :$$$  \n :$$$     :$$$$$$$$$$$$$$:$$$$$$$$$_    \"^T$bpd$$$$,     $$$; \n $$$;     :$$$$$$$$$$$$$$bT$$$$$P^^T$p.    `T$$$$$$;     :$$$ \n:$$$      :$$$$$$$$$$$$$$P `^^^'    \"^T$p.    lb`TP       $$$;\n:$$$      $$$$$$$$$$$$$$$              `T$$p._;$b         $$$;\n$$$;      $$$$$$$$$$$$$$;                `T$$$$:Tb        :$$$\n$$$;      $$$$$$$$$$$$$$$                        Tb    _  :$$$\n:$$$     d$$$$$$$$$$$$$$$.                        $b.__Tb $$$;\n:$$$  .g$$$$$$$$$$$$$$$$$$$p...______...gp._      :$`^^^' $$$;\n $$$;  `^^'T$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$p.    Tb._, :$$$ \n :$$$       T$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$b.   \"^\"  $$$; \n  $$$;       `$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$b      :$$$  \n  :$$$        $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$;     $$$;  \n   T$$b    _  :$$`$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$;   d$$P   \n    T$$b   T$g$$; :$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  d$$P    \n     T$$b   `^^'  :$$ \"^T$$$$$$$$$$$$$$$$$$$$$$$$$$$ d$$P     \n      T$$b        $P     T$$$$$$$$$$$$$$$$$$$$$$$$$;d$$P      \n       T$$b.      '       $$$$$$$$$$$$$$$$$$$$$$$$$$$$P       \n        `T$$$p.          d$$$$$$$$$$$$$$$$$$$$$$$$$$P'        \n          `T$$$$p..__..g$$$$$$$$$$$$$$$$$$$$$$$$$$P'          \n            \"^$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$^\"            \n               \"^T$$$$$$$$$$$$$$$$$$$$$$$$$$P^\"               \n                   \"\"\"^^^T$$$$$$$$$$P^^^\"\"\"");
        System.out.println();
    }
    public static void Imperial_Courier_Elite2()
    {
        Load_Animation(15);
        System.out.println("\n\n      .  . '    .                                             \n      '   .            . '            .                +           \n              `                          '    . '\n        .                         ,'`.                         .\n   .                  ..\"    _.-;'    `.              .    \n             _.-\\\"`.##%\"_.--\" ,'        `.           \"#\"     ___,,od000\n           ,'\"-_ _.-.--\"\\   ,'            `-_       '%#%',,/////00000HH\n         ,'     |_.'     )`/-     __..--\"\"`-_`-._    J L/////00000HHHHM\n . +   ,'   _.-\"        / /   _-\"\"           `-._`-_/___\\///0000HHHHMMM\n     .'_.-\"\"      '    :_/_.-'                 _,`-/__V__\\0000HHHHHMMMM\n . _-\"\"                         .        '   _,////\\  |  /000HHHHHMMMMM\n_-\"   .       '  +  .              .        ,//////0\\ | /00HHHHHHHMMMMM\n       `                                   ,//////000\\|/00HHHHHHHMMMMMM\n.             '       .  ' .   .       '  ,//////00000|00HHHHHHHHMMMMMM\n     .             .    .    '           ,//////000000|00HHHHHHHMMMMMMM\n                  .  '      .       .   ,///////000000|0HHHHHHHHMMMMMMM\n  '             '        .    '         ///////000000000HHHHHHHHMMMMMMM\n                    +  .  . '    .     ,///////000000000HHHHHHHMMMMMMMM\n     '      .              '   .       ///////000000000HHHHHHHHMMMMMMMM\n   '                  . '              ///////000000000HHHHHHHHMMMMMMMM\n                           .   '      ,///////000000000HHHHHHHHMMMMMMMM\n       +         .        '   .    .  ////////000000000HHHHHHHHMMMMMMhs");
        System.out.println();
    }
    public static void Quake()
    {
        Load_Animation(10);
        System.out.println("\n\n         _______________________________________\n        |\\ ___________________________________ /|\n        | | _                               _ | |\n        | |(+)        _           _        (+)| |\n        | | ~      _--/           \\--_      ~ | |\n        | |       /  /             \\  \\       | |\n        | |      /  |               |  \\      | |\n        | |     /   |               |   \\     | |\n        | |     |   |    _______    |   |     | |\n        | |     |   |    \\     /    |   |     | |\n        | |     \\    \\_   |   |   _/    /     | |\n        | |      \\     -__|   |__-     /      | |\n        | |       \\_                 _/       | |\n        | |         --__         __--         | |\n        | |             --|   |--             | |\n        | |               |   |               | |\n        | |                | |                | |\n        | |                 |                 | |\n        | |                                   | |\n        | |   I S   G O O D   F O R   Y O U   | |\n        | | _                               _ | |\n        | |(+)                             (+)| |\n        | | ~                               ~ | |\n        | |___________________________________| |\n        |/_____________________________________\\|");
        System.out.println();
    }
    public static void Space_Invaders()
    {
        Load_Animation(5);
        System.out.println("\n\n         ____\n        /___/\\_\n       _\\   \\/_/\\__\n     __\\       \\/_/\\\n     \\   __    __ \\ \\\n    __\\  \\_\\   \\_\\ \\ \\   __\n   /_/\\\\   __   __  \\ \\_/_/\\\n   \\_\\/_\\__\\/\\__\\/\\__\\/_\\_\\/\n      \\_\\/_/\\       /_\\_\\/\n         \\_\\/       \\_\\/");
        System.out.println();
    }
    public static void Pokemon_Logo()
    {
        Load_Animation(10);
        System.out.println("\n\n                                  ,'\\\n    _.----.        ____         ,'  _\\   ___    ___     ____\n_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\n\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\n \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\n   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\n    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\n     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\n      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\n       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\n        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\n                                `'                            '-._|");
        System.out.println();
    }
    public static void Bulbasaur()
    {
        Load_Animation(10);
        System.out.println("\n\n                                           /\n                        _,.------....___,.' ',.-.\n                     ,-'          _,.--\"        |\n                   ,'         _.-'              .\n                  /   ,     ,'                   `\n                 .   /     /                     ``.\n                 |  |     .                       \\.\\\n       ____      |___._.  |       __               \\ `.\n     .'    `---\"\"       ``\"-.--\"'`  \\               .  \\\n    .  ,            __               `              |   .\n    `,'         ,-\"'  .               \\             |    |\n   ,'          '    _.'                -._          /    |\n  ,`-.    ,\".   `--'                      >.      ,'     |\n . .'\\'   `-'       __    ,  ,-.         /  `.__.-      ,'\n ||:, .           ,'  ;  /  / \\ `        `.    .      .'/\n ||:0  \\          `--'  ' ,'_  . .         `.__, \\   , /\n/ :_  |                 .  \"' :_;                `.'.'\n.    \"\"'                  \"\"\"\"\"'                    V\n `.                                 .    `.   _,..  `\n   `,_   .    .                _,-'/    .. `,'   __  `\n    ) \\`._        ___....----\"'  ,'   .'  \\ |   '  \\  .\n   /   `. \"`-.--\"'         _,' ,'     `---' |    `./  |\n  .   _  `\"\"'--.._____..--\"   ,             '         |\n  | .\" `. `-.                /-.           /          ,\n  | `._.'    `,_            ;  /         ,'          .\n .'          /| `-.        . ,'         ,           ,\n '-.__ __ _,','    '`-..___;-...__   ,.'\\ ____.___.'\n `\"^--'..'   '-`-^-'\"--    `-^-'`.''\"\"\"\"\"`.,^.`.--' ");
        System.out.println();
    }
    public static void Caterpie()
    {
        Load_Animation(10);
        System.out.println("\n\n                   _,........_\n               _.-'    ___    `-._\n            ,-'      ,'   \\       `.\n _,...    ,'      ,-'     |  ,\"\"\":`._.\n/     `--+.   _,.'      _.',',|\"|  ` \\`\n\\_         `\"'     _,-\"'  | / `-'   | |\\\n  `\"---.._      ,-\"       ||        | | |\n      /   `.   |          ' `.     ,' ; |\n     |     |   |           `._`\"\"\"' ,'  |__\n     |      `--'____          `----'    .' `.\n     |    _,-\"\"\"    `-.                 |    \\\n     (   /             `.               /     |\n      `./     __..._     `.           ,'      |\n        |  ,-\"      `.    | ._     _.'        |\n        . |           \\   |   /`\"\"\"      __   |          ,\"`.\n         `|           | _,.__ |        ,'  `. |          |   |\n          `-._       /-'     `v       .     , '          |   |\n              ,...-'          `      |     , /           |   |\n              |            ,----.     `...' /            |   |\n              .--.        |      |        ,'             |   |\n             |    \\       |      |'-...--<               .  /\n             `     |       . __,,_    ..  |               \\/\n              `-..'.._  __,-'     \\  |  |/`._           ,'`\n                  |   \"\"       .--`. `--,  ,-`..____..,'   |\n                   \\          /     \\ _.  |   | \\  .-.\\    |\n                  .'._        |     .\\    `---' |  |  || ,'\n                   .  `..____,-.._.'  `._       |  `--;\".'\n                    `--\"' `.            ,`-..._/__,.-.,'\n                            `-.__  __,.'     ,' ,' _-'\n                                 `'...___..`'--^--' ");
        System.out.println();
    }
    public static void Venusaur()
    {
        Load_Animation(10);
        System.out.println("\n\n                           _._       _,._\n                        _.'   `. ' .'   _`.\n                ,\"\"\"/`\"\"-.-.,/. `VV'\\-,`.,--/\"\"\".\"-..\n              ,'    `...,' . ,\\-----._|     `.   /   \\\n             `.            .`  -'`\"\" .._   :> `-'   `.\n            ,'  ,-.  _,.-'| `..___ ,'   |'-..__   .._ |\n           .    \\_ -'   `-'     ..      `.-' `.`-.'_ .|\n           |   ,',-,--..  ,--../  `.  .-.    , `-.  ``.\n           `.,' ,  |   |  `.  /'/,,.\\/  |    \\|   |\n                \\  `---'    `/   .   \\  .     '   |\n              ,__`\"        ,'|`'\\_/`.'\\'        |\\-'-, _,.\n       .--...`-. `-`. /    '- ..      _,    /\\ ,' .--\"'  ,'\".\n     _'-\"\"-    --  _`'-.../ __ '.'`-^,_`-\"\"\"\"---....__  ' _,-`\n   _.----`  _..--.'        |  \"`-..-\" __|'\"'         .\"\"-. \"\"'--.._\n  /        '    /     ,  _.+-.'  ||._'   \"\"\"\". .          `     .__\\\n `---    /        /  / /'       _/|..`  -. `-`\\ \\   \\  \\   `.  \\ `-..\n,\" _.-' /    /` ./  /`_|_,-\"   ','|       `. | -'`._,   \\  \\ .  `.   |\n`\"' /  /  / ,__...-----| _.,  ,'            `|----.._`-.|' |. .` ..  .\n   /  '| /.,/   \\--.._ `-,' ,          .  '`.'  __,., '  ''``._ \\ \\`,'\n  /_,'---  ,     \\`._,-` \\ //  / . \\    `._,  -`,  / / _   |   `-+ -\n   /       `.     ,  ..._ ' `_/ '| |\\ `._'       '-.'   `.,'     |\n  '         /    /  ..   `.  `./ | ; `.'    ,\"\" ,.  `.    \\      |\n   `.     ,'   ,'   | |\\  |       \"        |  ,'\\ |   \\    `    ,^\n   /|`.  /    '     | `-| '                  /`-' |    \\    `._/   \\\n  / | .`|    |  .   `._.'                   `.__,'   .  |     |  (` |\n '-\"\"-'_|    `. `.__,._____     .    _,        ____ ,-  /     \".-'\"'\n        \\      `-.  \\/.    `\"--.._    _,.---'\"\"\\/  \"_,.'     /-'\n         )        `-._ '-.        `--\"      _.-'.-\"\"        `.\n        ./            `,. `\".._________...\"\"_.-\"`.          _/\n       /_\\.__,\"\".   ,.'  \"`-...________.---\"     .\".   ,.  / \\\n              \\_/\"\"\"-'                           `-'--(_,`\"`-`");
        System.out.println();
    }
    public static void Ivysaur()
    {
        Load_Animation(10);
        System.out.println("\n\n                               ,'\"`.,./.\n                             ,'        Y',\"..\n                           ,'           \\  \\ \\\n                          /              . |  `\n                         /               | |   \\\n            __          .                | |    .\n       _   \\  `. ---.   |                | |    |\n      / `-._\\   `V   \\  |                |/     |\n     _`.    ``    \\   \\ |..              '      |,-'\"\"7,....\n    (      '-.     . , `|  | , |`. , ,  /,     ,'    '/   ,'_,.-.\n     `-..     `-.  : :     |/ `   ' \"\\,' | _  /          '-'    /..-.\n      \\\"\"' __.,.-`.: :        /   /._    |'.,'               ;    .  /.\n       `--,   _.-' `\".           /__ `'-.' '         .      ;   ;      )\n       ,---..._,.--\"\"\"\"\"\"\"--.__..----,-.'   .  :    .'   ,.----=_  .--  \n       |                          ,':| /    | ;     ;.,-'--      ,.)\n       |    .----.              .'  :|'     |; ,.-='\"-.`\"`' _   -.'\n       /    \\    /               `. :|--.  _v,\"---.._        \"----'\n     ,' `.   \\ ,'           _,     `''   ``.-'       `-  -..___,'\n    . ,.  .   `   __     .-'  _.-           `.     .__    \\\n    |. |`        \"  ;   !   ,.  |             `.    `.`'---'\n    ,| |C\\       \\ /    | ,' |()|            -. |-..--`\n   /  \\|__)       '      (___|__]        `.  `- |`.\n  .       ,'                   ,   /       .    `. \\\n   \\                       .,-'  ,'         .     `-.\n     x---..`.  -'  __..--'\"/\"\"\"\"\"  ,-.      |   |   |\n    / \\--._'-.,.--'     _`-    _. ' /       |     -.|\n   ,   .   `-..__ ...--'  _,.-' | `   ,.-.  ;   /  '|\n  .  _,'         '\"-----\"\"      |    `   | /  ,'    ;\n  |-'  .-.    `._               |     `._// ,'     /\n _|    `-'   _,' \"`--.._________|        `,'    _ /.\n//\\   ,-._.'\"/\\__,.   _,\"     /_\\__/`. /'.-.'.-/_,`-'\n`-\"`\"' v'    `\"  `-`-\"              `-'`-`  `'");
        System.out.println();
    }
    public static void Squirtle()
    {
        Load_Animation(10);
        System.out.println("\n\n               _,........__\n            ,-'            \"`-.\n          ,'                   `-.\n        ,'                        \\\n      ,'                           .\n      .'\\               ,\"\".       `\n     ._.'|             / |  `       \\\n     |   |            `-.'  ||       `.\n     |-.-|            '-._,'||       | \\\n     .`.,'             `..,'.'       , |`-.\n     |                       .'`.  _/  |   `._\n     `-.._'-   ,          _ _'   -\" \\  .      \\\n`.\"\"\"\"\"'-.`-...,---------','         `. `....__\\\n.'        `\"-..___      __,'\\          \\  \\     \\\n\\_ .          |   `\"\"\"\"'    `.           . \\     \\\n  `.          |              `.          |  .     |\n    `.        |`--...________.'.        |   |     |\n      `._    .'      |          `.     .|   ,     |\n         `--,\\       .            `7\"\"' |  ,      |\n            ` `      `            /     |  |      |    _,-'\"\"\"`-.\n             \\ `.     .          /      |  '      |  ,'          `.\n              \\  x.__  .        '       .   \\    /| /              \\\n               \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |\n                `        .        `._ ___,>.  `/ .-       ,---.     |\n                ,`-.      \\         .\"     `.  |/        |     |    |\n               /    `.     \\       /         \\ /         |     /    |\n              |       `-.   7-.._ .          |\"          \\         /\n              |          `./_    `|          | ...        .     _,'\n              `.           / `----|          |    '-----...`---'\n                \\          \\      |          |\n               ,'           )     `.         |\n                7____,,..--'      /          |\n                                  `---.__,--.'");
        System.out.println();
    }
    public static void Charmander()
    {
        Load_Animation(10);
        System.out.println("\n\n              _.--\"\"`-..\n            ,'          `.\n          ,'          __  `.\n         /|          \" __   \\\n        , |           / |.   .\n        |,'          !_.'|   |\n      ,'             '   |   |\n     /              |`--'|   |\n    |                `---'   |\n     .   ,                   |                       ,\".\n      ._     '           _'  |                    , ' \\ `\n  `.. `.`-...___,...---\"\"    |       __,.        ,`\"   |,|\n  |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\\n-:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .\n  `,         \"\"\"\"'     `.              ,'         |   |  ',,\n    `.      '            '            /          '    |'. |/\n      `.   |              \\       _,-'           |       ''\n        `._'               \\   '\"\\                .      |\n           |                '     \\                `._  ,'\n           |                 '     \\                 .'|\n           |                 .      \\                | |\n           |                 |       |              ,' |\n           `                 |       |             /   '\n            \\                |       |           ,'   /\n          ,' \\               |  _.._ ,-..___,..-'    ,'\n         /     .             .      `!             ,//\n        /       `.          /        .           .'/\n       .          `.       /         |        _.'.'\n        `.          7`'---'          |------\"'_.'\n       _,.`,_     _'                ,''-----\"'\n   _,-_    '       `.     .'      ,\\\n   -\" /`.         _,'     | _  _  _.|\n    \"\"--'---\"\"\"\"\"'        `' '! |! /\n                            `\" \" -' ");
        System.out.println();
    }
    public static void Charmeleon()
    {
        Load_Animation(10);
        System.out.println("\n\n 		      ,-'`\\\n                  _,\"'    /\n           __....+       /               .\n       ,-'\"             /               ; `-._.'.\n      /                (              ,'       .'\n     |            _.    \\             \\   ---._ `-.\n     ,|    ,   _.' \\     \\             `- ,'   \\   `.`.\n     |'    \\ ,'._,\\ `.    .              /       ,--. |\n  .,-        `._  |  |    |              \\       _   | .\n /              `\"--'    /              .'       ``. |  )\n.\\    ,                 |                .        \\ `. '\n`.                .     |                '._  __   ;. \\'\n  `-..--------...'       \\                  `'  `-\"'.  \\\n      `......___          `._                        |  \\\n               /`            `..                     |   .\n              /|                `-.                  |    \\\n             / |               \\   `._               .    |\n           ,'  |,-\"-.   .       .     `.            /     |\n         ,'    |     '   \\      |       `.         /      |\n       ,'     /|       \\  .     |         .       /       |\n     ,'      / |        \\  .    +          \\    ,'       .'\n    .       .  |         \\ |     \\          \\_,'        / /\n    |       |  |          `|      .          `        ,' '\n    |    _. |   \\          /      |           .     .' ,'\n    |   /  `|    \\        .       |  /        |   ,' .'\n    |   ,-..\\     -.     ,        | /         |,.' ,'\n    `. |___,`    /  `.   /`.       '          |  .'\n      '-`-'     |     ` /.\"7-..../|          ,`-'\n                |        .'  / _/_|          .\n                `,       `\"'/\"'    \\          `.\n                  `,       '.       `.         |\n             __,.-'         `.        \\'       |\n            /_,-'\\          ,'        |        _.\n             |___.---.   ,-'        .-':,-\"`\\,' .\n                  L,.--\"'           '-' |  ,' `-.\\\n                                        `.' ");
        System.out.println();
    }
    public static void Wartortle()
    {
        Load_Animation(10);
        System.out.println("\n\n     __                                _.--'\"7\n    `. `--._                        ,-'_,-  ,'\n     ,'  `-.`-.                   /' .'    ,|\n     `.     `. `-     __...___   /  /     - /\n       `.     `  `.-\"\"        \" .  /       /\n         \\     /                ` /       /\n          \\   /                         ,'\n          '._'_               ,-'       |\n             | \\            ,|  |   ...-'\n             || `         ,|_|  |   | `             _..__\n            /|| |          | |  |   |  \\  _,_    .-\"     `-.\n           | '.-'          |_|_,' __!  | /|  |  /           \\\n   ,-...___ .=                  ._..'  /`.| ,`,.      _,.._ |\n  |   |,.. \\     '  `'        ____,  ,' `--','  |    /      |\n ,`-..'  _)  .`-..___,---'_...._/  .'      '-...'   |      /\n'.__' \"\"'      `.,------'\"'      ,/            ,     `.._.' `.\n  `.             | `--........,-'.            .         \\     \\\n    `-.          .   '.,--\"\"     |           ,'\\        |      .\n       `.       /     |          |         ,\\  .       |  .,---.\n         `._   '      |           \\        /  .  \\      | /   __ `.\n            `-.       |            `._   ,    |   .    / |   '  `. .\n              |       |               `\"' |  .    |   /  '      .' |\n              |       |                   |  |    |  /  , `.__,'   |\n              `.      |                 _.   `    . ,'-'           |\n               |`\"---..\\._______,...,--' |   |   /|'      /        |\n               '       |                 |   .  / |      '        /\n                .      .              ____^   \\'  |    -',       /\n               / `.     .          _,\"     \\   | /  ,-','      ,'\n              /    `.  ,'`-._     /         \\  |'.,'_,'      .'\n             .       `.      `-..'             |_,-'      _.'\n             |         `._      |            ''/      _,-'\n             |            '-..._\\             `__,.--'\n            ,'           ,' `-.._`.            .\n           `.    __      |       \"'`.          |\n             `-\"'  `\"\"\"\"'            7         `.\n                                    `---'--.,'\"`' ");
        System.out.println();
    }
    //public static void RollCredits()
    //{
    //Art.py , asciiart.eu , 
    //}
    public static void Console_Graphic(String consoleInput)
    {
        Load_Animation(5);
        System.out.println();
        int length = consoleInput.length();
        for(byte i = 1 ; i<=6 ; i++)
        {
            for(int j = 0 ; j<length ; j++)
            {
                String x = String.valueOf(consoleInput.charAt(j));
                switch(x)
                {
                    case "A":
                        A(i);
                        break;
                    case "B":
                        B(i);
                        break;
                    case "C":
                        C(i);
                        break;
                    case "D":
                        D(i);
                        break;
                    case "E":
                        E(i);
                        break;
                    case "F":
                        F(i);
                        break;
                    case "G":
                        G(i);
                        break;
                    case "H":
                        H(i);
                        break;
                    case "I":
                        I(i);
                        break;
                    case "J":
                        J(i);
                        break;
                    case "K":
                        K(i);
                        break;
                    case "L":
                        L(i);
                        break;
                    case "M":
                        M(i);
                        break;
                    case "N":
                        N(i);
                        break;
                    case "O":
                        O(i);
                        break;
                    case "P":
                        P(i);
                        break;
                    case "Q":
                        Q(i);
                        break;
                    case "R":
                        R(i);
                        break;
                    case "S":
                        S(i);
                        break;
                    case "T":
                        T(i);
                        break;
                    case "U":
                        U(i);
                        break;
                    case "V":
                        V(i);
                        break;
                    case "W":
                        W(i);
                        break;
                    case "X":
                        X(i);
                        break;
                    case "Y":
                        Y(i);
                        break;
                    case "Z":
                        Z(i);
                        break;
                    case "a":
                        a(i);
                        break;
                    case "b":
                        b(i);
                        break;
                    case "c":
                        c(i);
                        break;
                    case "d":
                        d(i);
                        break;
                    case "e":
                        e(i);
                        break;
                    case "f":
                        f(i);
                        break;
                    case "g":
                        g(i);
                        break;
                    case "h":
                        h(i);
                        break;
                    case "i":
                        i(i);
                        break;
                    case "j":
                        j(i);
                        break;
                    case "k":
                        k(i);
                        break;
                    case "l":
                        l(i);
                        break;
                    case "m":
                        m(i);
                        break;
                    case "n":
                        n(i);
                        break;
                    case "o":
                        o(i);
                        break;
                    case "p":
                        p(i);
                        break;
                    case "q":
                        q(i);
                        break;
                    case "r":
                        r(i);
                        break;
                    case "s":
                        s(i);
                        break;
                    case "t":
                        t(i);
                        break;
                    case "u":
                        u(i);
                        break;
                    case "v":
                        v(i);
                        break;
                    case "w":
                        w(i);
                        break;
                    case "x":
                        x(i);
                        break;
                    case "y":
                        y(i);
                        break;
                    case "z":
                        z(i);
                        break;
                    case "0":
                        No_0(i);
                        break;
                    case "1":
                        No_1(i);
                        break;
                    case "2":
                        No_2(i);
                        break;
                    case "3":
                        No_3(i);
                        break;
                    case "4":
                        No_4(i);
                        break;
                    case "5":
                        No_5(i);
                        break;
                    case "6":
                        No_6(i);
                        break;
                    case "7":
                        No_7(i);
                        break;
                    case "8":
                        No_8(i);
                        break;
                    case "9":
                        No_9(i);
                        break;
                    case "~":
                        Tilde(i);
                        break;
                    case "`":
                        Acute(i);
                        break;
                    case "!":
                        Exclamation(i);
                        break;
                    case "@":
                        Ampersat(i);
                        break;
                    case "#":
                        Octothorpe(i);
                        break;
                    case "₹":
                        Rupees(i);
                        break;
                    case "£":
                        Sterling(i);
                        break;
                    case "€":
                        Euro(i);
                        break;
                    case "$":
                        Dollar(i);
                        break;
                    case "¢":
                        Cent(i);
                        break;
                    case "¥":
                        Yuan(i);
                        break;
                    case "§":
                        Micro(i);
                        break;
                    case "%":
                        Percent(i);
                        break;
                    case "°":
                        Degree(i);
                        break;
                    case "^":
                        Caret(i);
                        break;
                    case "&":
                        Ampersand(i);
                        break;
                    case "*":
                        Asterisk(i);
                        break;
                    case "(":
                        Left_Parenthesis(i);
                        break;
                    case ")":
                        Right_Parenthesis(i);
                        break;
                    case "-":
                        Hyphen(i);
                        break;
                    case "_":
                        Underscore(i);
                        break;
                    case "+":
                        Plus(i);
                        break;
                    case "=":
                        Equal(i);
                        break;
                    case "{":
                        Left_Brace(i);
                        break;
                    case "}":
                        Right_Brace(i);
                        break;
                    case "[":
                        Left_Braket(i);
                        break;
                    case "]":
                        Right_Braket(i);
                        break;
                    case "|":
                        Pipe(i);
                        break;
                    case "\\":
                        Back_Slash(i);
                        break;
                    case "/":
                        Forward_Slash(i);
                        break;
                    case ":":
                        Colon(i);
                        break;
                    case ";":
                        Semicolon(i);
                        break;
                    case "\"":
                        Quotation_Mark(i);
                        break;
                    case "'":
                        Apostrophe(i);
                        break;
                    case "<":
                        Left_Angle_Brakets(i);
                        break;
                    case ">":
                        Right_Angle_Brakets(i);
                        break;
                    case ",":
                        Comma(i);
                        break;
                    case ".":
                        Period(i);
                        break;
                    case "?":
                        Question_Mark(i);
                        break;
                    case " ":
                        Space_Bar(i);
                        break;
                    default:
                        Character_Error(i);
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String args[])
    {
        Hitman();
        Lara_Croft();
        Mortal_Kombat();
        Imperial_Courier_Elite2();
        Quake();
        Space_Invaders();
        Pokemon_Logo();
        Bulbasaur();
        Venusaur();
        Ivysaur();
        Squirtle();
        Charmander();
        Charmeleon();
        Wartortle();
        Console_Graphic("Hello, World!");
    }
}
