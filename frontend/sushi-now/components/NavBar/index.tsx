import Image from "next/image";
import logo from "../../public/logo.png";

const Navbar: React.FC = () => {
  return (
    <nav className="w-full h-full">
      <Image src={logo} alt={"logo"} width={400} className="mt-5" />
    </nav>
  );
};

export default Navbar;
