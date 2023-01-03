import Head from "next/head";
import { ReactNode } from "react";
import Navbar from "../NavBar";

interface BaseLayoutProps extends React.HTMLAttributes<HTMLDivElement> {
  children: ReactNode;
}

const BaseLayout: React.FC<BaseLayoutProps> = ({ children }) => {
  return (
    <div className="w-screen h-screen select-none">
      <Head>
        <title>SushiNow</title>
        <meta
          name="viewport"
          content="initial-scale=1.0, width=device-width"
        ></meta>
      </Head>
      <header className="flex top-0 w-full max-w-full">
        <Navbar />
      </header>
      <div className="mt-14">{children}</div>
    </div>
  );
};

export default BaseLayout;
