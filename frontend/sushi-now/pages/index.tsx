import BaseLayout from "../components/BaseLayout";
import { useForm } from "react-hook-form";

export default function Home() {
  const { register, handleSubmit } = useForm();
  const onSubmit = (data: any) => console.log(data);

  return (
    <main>
      <BaseLayout>
        <div className="relative">
          {/* Inserisci username */}
          <form action="" method="post" onSubmit={handleSubmit(onSubmit)}>
            <div className="flex flex-col justify-center space-y-5 absolute z-10 w-full">
              <div className="mx-4">
                <input
                  {...(register("username"), { required: true })}
                  type="text"
                  id="username"
                  placeholder="Inserisci username"
                  className="w-full bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg after:block p-2.5"
                />
              </div>
              <div className="mx-4">
                <input
                  type="number"
                  id="tableNumber"
                  {...(register("tableNumber"), { required: true })}
                  placeholder="Inserisci il numero del tavolo"
                  className="w-full bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg after:block p-2.5"
                />
              </div>
              <div className="flex justify-center mx-4">
                <button
                  type="submit"
                  className="w-1/2 text-white bg-primary font-medium rounded-lg text-sm sm:w-auto px-5 py-2.5 text-center"
                >
                  Inizia a ordinare
                </button>
              </div>
            </div>
          </form>
        </div>
      </BaseLayout>
    </main>
  );
}
