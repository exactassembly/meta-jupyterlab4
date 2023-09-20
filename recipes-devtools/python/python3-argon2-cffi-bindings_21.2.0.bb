SUMMARY = "Low-level CFFI bindings for Argon2"
HOMEPAGE = "https://github.com/hynek/argon2-cffi-bindings"
AUTHOR = "Hynek Schlawack <hs@ox.cx>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4642dfcbd13c1cc49e9f99df9de51ba1"

SRC_URI[sha256sum] = "bb89ceffa6c791807d1305ceb77dbfacc5aa499891d2c55661c6459651fc39e3"

inherit pypi python_hatchling

DEPENDS += "\
    python3-setuptools-scm-native \
    python3-cffi-native \
"

ARCH = "unknown"
ARCH:arm = "arm"
ARCH:aarch64 = "aarch64"
ARCH:microblaze = "microblaze"
ARCH:x86_64 = "x86_64"
ARCH:x86 = "x86"

OS = "unknown"
OS:linux-gnu = "Linux"
OS:linux-gnueabi = "Linux"

export ARCHFLAGS = "-arch ${ARCH}"

do_configure:prepend() {
   sed -i -e 's,uname -m,echo ${ARCH},' -e 's,uname -s,echo ${OS},' ${S}/extras/libargon2/Makefile
}